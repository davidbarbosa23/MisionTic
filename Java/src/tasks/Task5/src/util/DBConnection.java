package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DBProperties.dbURL, DBProperties.username, DBProperties.password);
            if (conn != null) {
                System.out.println(">>> DB Connection established <<<");
                return conn;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return conn;
    }
}
