package repository;

import java.sql.*;

public class Database {
    public Connection open(){
        String url = Constants.url;

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("# Connection to SQLite has been established.");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%';");
            System.out.println("# Following tables has been found:");
            while (rs.next()) {
                System.out.println("# " + rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("# Couldn't open SQLite connection due to:");
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void close(Connection conn)
    {
        try
        {
            conn.close();
        }
        catch (SQLException e)
        {
            System.out.println("Couldn't close SQLite connection due to:");
            System.out.println(e.getMessage());
        }
    }
}
