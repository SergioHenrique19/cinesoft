package controllers;

import repository.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private static Database db;
    private static Connection connection;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    public Filme()
    {
        db = new Database();
        connection = db.open();
    }

    public int create(String titulo, String data, int duracao)
    {
        return db.insert(connection, "filmes", "titulo, lancamento, duracao", "'Avatar', '2009-05-01', 180");
    }

    public void update(int id, String fields)
    {
        db.update(connection, "filmes", fields, "id == " + Integer.toString(id));
    }

    public List<models.Filme> getAll()
    {
        List<models.Filme> filmes = new ArrayList<models.Filme>();
        ResultSet result = db.select(connection, "*", "filmes");
        while(true)
        {
            try {
                if (!result.next()) break;
                filmes.add(new models.Filme(result.getInt("id"), result.getString("titulo"), sdf.parse(result.getString("lancamento")), result.getInt("duracao")));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return filmes;
    }

    public models.Filme getByTitulo(String titulo)
    {
        models.Filme filme = null;
        ResultSet result = db.select(connection, "*", "filmes", "titulo LIKE '%"+titulo+"%';");
        while(true)
        {
            try {
                if (!result.next()) break;
                filme = new models.Filme(result.getInt("id"), result.getString("titulo"), sdf.parse(result.getString("lancamento")), result.getInt("duracao"));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return filme;
    }
}
