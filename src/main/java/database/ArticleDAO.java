package database;

import model.Article;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {

    // Insert article
    public void insertArticle(Article article) throws SQLException {
        String sql = "INSERT INTO articles (title, content, author) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, article.getTitle());
            preparedStatement.setString(2, article.getContent());
            preparedStatement.setString(3, article.getAuthor());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Select article by id
    public Article selectArticle(int id) {
        Article article = null;
        String sql = "SELECT id, title, content, author, created_at FROM articles WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                article = new Article(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("author"),
                        rs.getString("created_at"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return article;
    }

    // Select all articles
    public List<Article> selectAllArticles() {
        List<Article> articles = new ArrayList<>();
        String sql = "SELECT * FROM articles";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery()) {
            while (rs.next()) {
                articles.add(new Article(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("author"),
                        rs.getString("created_at")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    // Update article
    public boolean updateArticle(Article article) {
        boolean rowUpdated = false;
        String sql = "UPDATE articles SET title = ?, content = ?, author = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, article.getTitle());
            preparedStatement.setString(2, article.getContent());
            preparedStatement.setString(3, article.getAuthor());
            preparedStatement.setInt(4, article.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    // Delete article
    public boolean deleteArticle(int id) {
        boolean rowDeleted = false;
        String sql = "DELETE FROM articles WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }
}
