package Model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConMySQL {
    public static Connection connect() {
        Connection connection = null;

        try {
            Driver driver =  new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            String username = "root";
            String password = "ZxcGul1000minus7";
            String url = "jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";

            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.getStackTrace();
        }

        return connection;
    }
}
