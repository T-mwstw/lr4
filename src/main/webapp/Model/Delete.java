package Model;

import Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private static Connection _connection;
    static public Integer delete(User user) {
        Integer deletedCount = 0;

        try {
            String query = "DELETE FROM users WHERE id= ? ";

            PreparedStatement statement = _connection.prepareStatement(query);
            statement.setInt(1, user.getId());

            deletedCount = statement.executeUpdate();
        } catch (SQLException e) {
            e.getStackTrace();
        }

        return deletedCount;
    }
}
