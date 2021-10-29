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
public class Customer {

    private int CusId;
    private String Name;
    private String Gender;
    private String Age;
    private String PhoneNum;
    private String IdentityNum;
    private String Address;

    public Customer() {
    }

    public Customer(int CusId, String Name, String Gender, String Age, String PhoneNum, String IdentityNum, String Address) {
        this.CusId = CusId;
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.PhoneNum = PhoneNum;
        this.IdentityNum = IdentityNum;
        this.Address = Address;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

   

    public int getCusId() {
        return CusId;
    }

    public void setCusId(int CusId) {
        this.CusId = CusId;
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

    

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getIdentityNum() {
        return IdentityNum;
    }

    public void setIdentityNum(String IdentityNum) {
        this.IdentityNum = IdentityNum;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Customer{" + "CusId=" + CusId + ", Name=" + Name + ", Gender=" + Gender + ", Date=" + Age + ", PhoneNum=" + PhoneNum + ", IdentityNum=" + IdentityNum + ", Address=" + Address + '}';
    }

    
}
