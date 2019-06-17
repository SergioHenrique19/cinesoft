package controllers;

import repository.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class IngressoMeio {
    private static Database db;
    private static Connection connection;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public IngressoMeio()
    {
        db = new Database();
        connection = db.open();
    }

    public models.IngressoMeio getById(int id) {
        models.IngressoMeio ingresso = null;
        ResultSet result = db.select(connection, "*", "IngressoMeio", "id == " + id +";");
        while(true)
        {
            try {
                if (!result.next()) break;
                ingresso = new models.IngressoMeio(result.getInt("id"),
                        sdf.parse(result.getString("venda")),
                        result.getInt("sessao"),
                        result.getInt("poltrona"),
                        result.getString("carteirinha"));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return ingresso;
    }

    public List<models.IngressoMeio> getAll() {
        List<models.IngressoMeio> ingressos = new ArrayList<models.IngressoMeio>();
        ResultSet result = db.select(connection, "*", "IngressoMeio");
        while (true) {
            try {
                if (!result.next()) break;
                ingressos.add(new models.IngressoMeio(result.getInt("id"),
                        sdf.parse(result.getString("venda")),
                        result.getInt("sessao"),
                        result.getInt("poltrona"),
                        result.getString("carteirinha")));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return ingressos;
    }

    public int create(String venda, int poltrona, int sessao, String carteirinha)
    {
        return db.insert(connection, "IngressoMeio", "venda,poltrona,sessao,carteirinha", "'"+venda+"'," + poltrona + ","+sessao+",'"+carteirinha+"'" );
    }

    public void update(int id, String fields)
    {
        db.update(connection, "IngressoMeio", fields, "id == " + Integer.toString(id));
    }
}
