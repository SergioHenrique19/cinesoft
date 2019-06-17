package controllers;

import repository.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class IngressoInteiro {
    private static Database db;
    private static Connection connection;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public IngressoInteiro()
    {
        db = new Database();
        connection = db.open();
    }

    public models.IngressoInteiro getById(int id) {
        models.IngressoInteiro ingresso = null;
        ResultSet result = db.select(connection, "*", "ingressoInteiro", "id == " + id +";");
        while(true)
        {
            try {
                if (!result.next()) break;
                ingresso = new models.IngressoInteiro(result.getInt("id"),
                        sdf.parse(result.getString("venda")),
                                result.getInt("sessao"),
                                result.getInt("poltrona"));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return ingresso;
    }

    public List<models.IngressoInteiro> getAll() {
        List<models.IngressoInteiro> ingressos = new ArrayList<models.IngressoInteiro>();
        ResultSet result = db.select(connection, "*", "ingressoInteiro");
        while (true) {
            try {
                if (!result.next()) break;
                ingressos.add(new models.IngressoInteiro(result.getInt("id"),
                        sdf.parse(result.getString("venda")),
                        result.getInt("sessao"),
                        result.getInt("poltrona")));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return ingressos;
    }

    public int create(String venda, int poltrona, int sessao)
    {
        return db.insert(connection, "ingressoInteiro", "venda,poltrona,sessao", "'"+venda+"'," + poltrona + ","+sessao );
    }

    public void update(int id, String fields)
    {
        db.update(connection, "ingressoInteiro", fields, "id == " + Integer.toString(id));
    }
}
