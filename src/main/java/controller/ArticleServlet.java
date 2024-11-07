package controller;

import database.ArticleDAO;
import model.Article;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/articles/*")
public class ArticleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ArticleDAO articleDAO;

    public void init() {
        articleDAO = new ArticleDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getPathInfo();
        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertArticle(request, response);
                    break;
                case "/delete":
                    deleteArticle(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateArticle(request, response);
                    break;
                case "/details":
                    showDetails(request, response);
                    break;
                default:
                    listArticles(request, response);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    // List all articles
    private void listArticles(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Article> listArticles = articleDAO.selectAllArticles();
        request.setAttribute("listArticles", listArticles);
        request.getRequestDispatcher("/article-list.jsp").forward(request, response);
    }

    // Show form to create a new article
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/article-form.jsp").forward(request, response);
    }

    // Insert a new article
    private void insertArticle(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String author = request.getParameter("author");
        Article newArticle = new Article(0, title, content, author, null);
        articleDAO.insertArticle(newArticle);
        response.sendRedirect("list");
    }

    // Show form to edit an article
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Article existingArticle = articleDAO.selectArticle(id);
        request.setAttribute("article", existingArticle);
        request.getRequestDispatcher("/article-form.jsp").forward(request, response);
    }

    // Update an article
    private void updateArticle(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String author = request.getParameter("author");

        Article article = new Article(id, title, content, author, null);
        articleDAO.updateArticle(article);
        response.sendRedirect("list");
    }

    // Show details of an article
    private void showDetails(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Article existingArticle = articleDAO.selectArticle(id);
        request.setAttribute("article", existingArticle);
        request.getRequestDispatcher("/article-details.jsp").forward(request, response);
    }

    // Delete an article
    private void deleteArticle(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        articleDAO.deleteArticle(id);
        response.sendRedirect("list");
    }
}
