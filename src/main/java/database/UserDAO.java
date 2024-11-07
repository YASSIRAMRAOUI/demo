package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDAO {

    // Create or insert user
    public void insertUser(User user) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO users" + " (name, city, email) VALUES " + " (?, ?, ?);")) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getCity());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    // Select user by id
    public User selectUser(int id) {
        User user = null;
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT id, name, city, email FROM users WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                user = new User(id, name, city, email);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }

    // Select all users
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users")) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                users.add(new User(id, name, city, email));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    // Update user
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection
                        .prepareStatement("UPDATE users SET name = ?, city = ?, email = ? WHERE id = ?;")) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getCity());
            statement.setString(3, user.getEmail());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    // Delete user
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?;")) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            e.printStackTrace();
        }
    }
}
