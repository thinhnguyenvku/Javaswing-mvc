/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Book;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class BookDAO {
    private java.sql.Connection conn;
    
    public BookDAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=LibraryManagement;"
                    + "username=sa;password=123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addBook(Book b) {
        String sql = "INSERT INTO book (BookId, Name, Category, Amount, Status) "
                + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, b.getBookId());
            ps.setString(2, b.getName());   
            ps.setString(3, b.getCategory());
            ps.setInt(4, b.getAmount());
            ps.setString(5, b.getStatus());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Book> getListBook() {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM book";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("Name"));
                b.setCategory(rs.getString("Category"));
                b.setAmount(rs.getInt("Amount"));        
                b.setStatus(rs.getString("Status"));

                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public ArrayList<Book> getFindBook(String Category) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM book WHERE Category LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, Category +"%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("Name"));
                b.setCategory(rs.getString("Category"));
                b.setAmount(rs.getInt("Amount"));        
                b.setStatus(rs.getString("Status"));
                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Book> getFindBook1(String Status) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM book WHERE Status LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, Status +"%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("Name"));
                b.setCategory(rs.getString("Category"));
                b.setAmount(rs.getInt("Amount"));        
                b.setStatus(rs.getString("Status"));
                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public static void main(String[] args) {
        new BookDAO();
    }
}
