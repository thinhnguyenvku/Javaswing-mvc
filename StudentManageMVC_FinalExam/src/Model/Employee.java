/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Employee {

    private Integer EmpId;
    private String Name;
    private String Gender;
    private String Age;
    private String PhoneNum;
    private String Address;
    private float Salary;

    public Employee() {
    }

    public Employee(Integer EmpId, String Name, String Gender, String Age, String PhoneNum, String Address, float Salary) {
        this.EmpId = EmpId;
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.PhoneNum = PhoneNum;
        this.Address = Address;
        this.Salary = Salary;
    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer EmpId) {
        this.EmpId = EmpId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

   
    

    @Override
    public String toString() {
        return "Employee{" + "EmpId=" + EmpId + ", Name=" + Name + ", Gender=" + Gender + ", Date=" + Age + ", PhoneNum=" + PhoneNum + ", Address=" + Address + ", Salary=" + Salary + '}';
    }
    
    
}
