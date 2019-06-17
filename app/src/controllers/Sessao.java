package controllers;

import repository.Database;

import java.sql.Connection;

public class Sessao {
    private static Database db;
    private static Connection connection;

    public Sessao()
    {
        db = new Database();
        connection = db.open();
    }

    public int create(String titulo, String data, int duracao)
    {
        return db.insert(connection, "sessao", "titulo, lancamento, duracao", "'Avatar', '2009-05-01', 180");
    }
}
