/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class TestConnectionDB {
    public static void main(String[] args) {
        var server = "DESKTOP-FO8QLMB\\MSSQLSERVER02";
        var user = "sa";
        var password = "123456";
        var db = "QLD";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try (java.sql.Connection conn = ds.getConnection()) {
            System.out.println("NP Thịnh 20IT2");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

   
}
