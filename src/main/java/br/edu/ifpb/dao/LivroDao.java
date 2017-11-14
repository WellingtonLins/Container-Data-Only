package br.edu.ifpb.dao;

import br.edu.ifpb.model.Livro;
import br.edu.ifpb.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LivroDao {

    private Connection connection;

    public LivroDao() {
        connection = DbUtil.getConnection();
    }

    public void adicionarLivro(Livro livro) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into livro(ISBN, descricao, edicao, anoLancamento) values (?,?,?,?)");
            // Parameters start with 1

            preparedStatement.setString(1, livro.getISBN());
            preparedStatement.setString(2, livro.getDescricao());
            preparedStatement.setString(3, livro.getEdicao());
            preparedStatement.setString(4, livro.getAnoLancamento());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLivro(String ISBN) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from livro where ISBN=?");
            // Parameters start with 1
            preparedStatement.setString(1, ISBN);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarLivro(Livro livro) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update livro set descricao=?, edicao=?,anoLancamento=? where ISBN=?");

            preparedStatement.setString(1, livro.getDescricao());
            preparedStatement.setString(2, livro.getEdicao());
            preparedStatement.setString(3, livro.getAnoLancamento());

            preparedStatement.setString(4, livro.getISBN());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Livro> todosLivros() {
        List<Livro> lista = new ArrayList<Livro>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from livro");
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setISBN(rs.getString("ISBN"));
                livro.setDescricao(rs.getString("descricao"));
                livro.setEdicao(rs.getString("edicao"));
                livro.setAnoLancamento(rs.getString("anoLancamento"));
                lista.add(livro);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public Livro livroPorISNB(String livroISBN) {
        Livro livro = new Livro();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from livro where ISBN=?");
            preparedStatement.setString(1, livroISBN);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                livro.setISBN(rs.getString("ISBN"));
                livro.setDescricao(rs.getString("descricao"));
                livro.setEdicao(rs.getString("edicao"));
                livro.setAnoLancamento(rs.getString("anoLancamento"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livro;
    }
}
