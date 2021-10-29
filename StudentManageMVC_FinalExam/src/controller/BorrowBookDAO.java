/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.BorrowBook;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class BorrowBookDAO {
    private java.sql.Connection conn;

    public BorrowBookDAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=LibraryManagement;"
                    + "username=sa;password=123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addBorrowBook(BorrowBook b) {
        String sql = "INSERT INTO borrowBook (BookId, CusId, EmpId,  Name, Amount, BorrowDate, PayDate) "
                + "VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, b.getBookId());
            ps.setInt(2, b.getCusId());
            ps.setInt(3, b.getEmpId());
            ps.setString(4, b.getName());
            ps.setInt(5, b.getAmount());
            ps.setString(6, b.getBorrowDate());
            ps.setString(7, b.getPayDate());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<BorrowBook> getListBorrowBook() {
        ArrayList<BorrowBook> list = new ArrayList<>();
        String sql = "SELECT * FROM borrowBook";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BorrowBook b = new BorrowBook();
                b.setBookId(rs.getInt("BookId"));
                b.setCusId(rs.getInt("CusId"));
                b.setEmpId(rs.getInt("EmpId"));
                b.setName(rs.getString("Name"));
                b.setAmount(rs.getInt("Amount"));
                b.setBorrowDate(rs.getString("BorrowDate"));
                b.setPayDate(rs.getString("PayDate"));

                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public ArrayList<BorrowBook> getFindBorrowBook(String Name) {
        ArrayList<BorrowBook> list = new ArrayList<>();
        String sql = "SELECT * FROM borrowBook WHERE Name LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, Name + "%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BorrowBook b = new BorrowBook();
                b.setBookId(rs.getInt("BookId"));
                b.setCusId(rs.getInt("CusId"));
                b.setEmpId(rs.getInt("EmpId"));
                b.setName(rs.getString("Name"));
                b.setAmount(rs.getInt("Amount"));
                b.setBorrowDate(rs.getString("BorrowDate"));
                b.setPayDate(rs.getString("PayDate"));

                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public static void main(String[] args) {
        new BorrowBookDAO();
    }
}
