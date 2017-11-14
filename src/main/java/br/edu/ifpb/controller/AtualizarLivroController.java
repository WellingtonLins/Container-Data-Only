package br.edu.ifpb.controller;

import br.edu.ifpb.dao.LivroDao;
import br.edu.ifpb.model.Livro;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wellington
 */
public class AtualizarLivroController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final String LIST_USER = "/listar.jsp";
    private final LivroDao dao;

    public AtualizarLivroController() {
        super();
        dao = new LivroDao();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Livro livro = new Livro();
        livro.setDescricao(request.getParameter("descricao"));
        livro.setEdicao(request.getParameter("edicao"));
        livro.setAnoLancamento(request.getParameter("anoLancamento"));
        livro.setISBN(request.getParameter("ISBN"));

        dao.atualizarLivro(livro);

        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("livros", dao.todosLivros());
        view.forward(request, response);
    }
}
