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
                System.out.println("# -" + rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("# Couldn't open SQLite connection due to:");
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ResultSet select(Connection conn, String fields, String table)
    {
        try {
            String sql = "SELECT " + fields +  " FROM " + table +";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            System.out.println("# Couldn't run SELECT query due to:");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ResultSet select(Connection conn, String fields, String table, String where)
    {
        try {
            String sql = "SELECT " + fields +  " FROM " + table + " WHERE " + where;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            System.out.println("# Couldn't run SELECT query due to:");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public int insert(Connection conn, String table, String fields, String values)
    {
        int id = -1;
        try{
            String sql = "INSERT INTO " + table + " (" + fields + ") VALUES("+ values +");";
            Statement stmt = conn.createStatement();
            int affected = stmt.executeUpdate(sql);
            System.out.println("# Rows affected by INSERT: " + affected);

            Statement getId = conn.createStatement();
            ResultSet rs = getId.executeQuery("SELECT last_insert_rowid();");
            while (rs.next()) {
                id = rs.getInt("last_insert_rowid()");
                System.out.println("# Last insertion ID: " + id);
            }
            return id;
        }
        catch (SQLException e)
        {
            System.out.println("# Couldn't run INSERT query due to:");
            System.out.println(e.getMessage());
            return id;
        }
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
