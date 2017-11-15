package br.edu.ifpb.controller;

import br.edu.ifpb.dao.LivroDao;
import br.edu.ifpb.model.Livro;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LivroController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final String INSERT_OR_EDIT = "/livro.jsp";
    private static final String LIST_USER = "/listar.jsp";
    private final LivroDao dao;

    public LivroController() {
        super();
        dao = new LivroDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            String livroISBN = request.getParameter("ISBN");
            dao.deleteLivro(livroISBN);
            forward = LIST_USER;
            request.setAttribute("livros", dao.todosLivros());
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            String livroISBN = request.getParameter("ISBN");
            Livro livro = dao.livroPorISNB(livroISBN);
            request.setAttribute("livro", livro);
        } else if (action.equalsIgnoreCase("listUser")) {
            forward = LIST_USER;
            request.setAttribute("livros", dao.todosLivros());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Livro livro = new Livro();
        UUID uuid = UUID.randomUUID();
 
        livro.setDescricao(request.getParameter("descricao"));
        livro.setEdicao(request.getParameter("edicao"));
        livro.setAnoLancamento(request.getParameter("anoLancamento"));
        livro.setISBN(request.getParameter("ISBN"));

        String livroISBN = request.getParameter("ISBN");
        if (livroISBN == null || livroISBN.isEmpty()) {
            livro.setISBN(uuid.toString().substring(0, 20));
            dao.adicionarLivro(livro);
        } else {
            livro.setISBN(livroISBN);
            dao.atualizarLivro(livro);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("livros", dao.todosLivros());
        view.forward(request, response);
    }
}
