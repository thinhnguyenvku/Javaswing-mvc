/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Employee;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class EmployeeDAO {
    private java.sql.Connection conn;

    public EmployeeDAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=LibraryManagement;"
                    + "username=sa;password=123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addEmployee(Employee b) {
        String sql = "INSERT INTO employee (EmpId, Name, Gender, Age, PhoneNum, Address, Salary) "
                + "VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, b.getEmpId());
            ps.setString(2, b.getName());
            ps.setString(3, b.getGender());
            ps.setString(4, b.getAge());
            ps.setString(5, b.getPhoneNum());
            ps.setString(6, b.getAddress());
            ps.setFloat(7, b.getSalary());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Employee> getListEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getInt("EmpId"));
                e.setName(rs.getString("Name"));
                e.setGender(rs.getString("Gender"));
                e.setAge(rs.getString("Age"));
                e.setPhoneNum(rs.getString("PhoneNum"));
                e.setAddress(rs.getString("Address"));
                e.setSalary(rs.getFloat("Salary"));

                list.add(e);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Employee> getFindEmployee(String Name) {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee WHERE Name LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, Name +"%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              Employee e = new Employee();
                e.setEmpId(rs.getInt("EmpId"));
                e.setName(rs.getString("Name"));
                e.setGender(rs.getString("Gender"));
                e.setAge(rs.getString("Age"));
                e.setPhoneNum(rs.getString("PhoneNum"));
                e.setAddress(rs.getString("Address"));
                e.setSalary(rs.getFloat("Salary"));

                list.add(e);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Employee> getFindEmployee1(String Gender) {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee WHERE Gender LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, Gender +"%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              Employee e = new Employee();
                e.setEmpId(rs.getInt("EmpId"));
                e.setName(rs.getString("Name"));
                e.setGender(rs.getString("Gender"));
                e.setAge(rs.getString("Age"));
                e.setPhoneNum(rs.getString("PhoneNum"));
                e.setAddress(rs.getString("Address"));
                e.setSalary(rs.getFloat("Salary"));

                list.add(e);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public static void main(String[] args) {
        new EmployeeDAO();
    }
}
