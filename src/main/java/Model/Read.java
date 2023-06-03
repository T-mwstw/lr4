package Model;

import Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Read {
    private static Connection _connection;
    static public ArrayList<User> load() {
        var users = new ArrayList<User>();

        try {
            String query = "SELECT * FROM users";
            PreparedStatement statement = _connection.prepareStatement(query);
            ResultSet items = statement.executeQuery();

            while (items.next()) {
                users.add(new User(
                        items.getInt(1),
                        items.getString(2),
                        items.getString(3),
                        items.getString(4),
                        items.getInt(5),
                        items.getString(6)));
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }

        return users;
    }
}
