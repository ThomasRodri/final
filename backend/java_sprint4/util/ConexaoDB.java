
package challenge2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/porto_challenge_db";
    private static final String jdbcEmail = "user";  // Update with actual email
    private static final String jdbcPassword = "password";  // Update with actual password

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL, jdbcEmail, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
