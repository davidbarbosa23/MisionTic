package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static Connection conn = null;

    public static Connection getConnection() {
        if (conn != null)
            return conn;

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
