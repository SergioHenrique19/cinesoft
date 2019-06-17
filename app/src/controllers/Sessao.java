package controllers;

import repository.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class Sessao {
    private static Database db;
    private static Connection connection;

    public Sessao()
    {
        db = new Database();
        connection = db.open();
    }

    public models.Sessao getById(int id)
    {
        models.Sessao sessao = null;
        ResultSet result = db.select(connection, "*", "sessoes", "id == " + id +";");
        while(true)
        {
            try {
                if (!result.next()) break;
                sessao = new models.Sessao()
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return sessao;
    }

    public int create(int idioma, int tela, int hora, int filme)
    {
        return db.insert(connection, "sessoes", "idioma,tela,hora,filme", idioma +","+tela+","+hora+","+filme );
    }
}
