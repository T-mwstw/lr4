package Model;

import Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    private static Connection _connection;
    public Integer update(User user) {
        Integer updatedCount = 0;

        try {
            String query = "UPDATE users SET name=?, poroda?, age=?, color=?, warning=? WHERE id=?";

            PreparedStatement statement = _connection.prepareStatement(query);
            statement.setString(1, user.getName());
            statement.setString(2, user.getPoroda());
            statement.setInt(3, user.getAge());
            statement.setString(4, user.getColor());
            statement.setString(5, user.getWarning());
            statement.setInt(6, user.getId());

            updatedCount = statement.executeUpdate();
        } catch (SQLException e) {
            e.getStackTrace();
        }

        return updatedCount;
    }
}
