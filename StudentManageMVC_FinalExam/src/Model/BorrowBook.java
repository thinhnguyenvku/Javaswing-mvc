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
public class BorrowBook {

    private Integer BookId;
    private Integer CusId;
    private Integer EmpId;
    private String Name;
    private Integer Amount;
    private String BorrowDate;
    private String PayDate;

    public BorrowBook() {
    }

    public BorrowBook(Integer BookId, Integer CusId, Integer EmpId, String Name, Integer Amount, String BorrowDate, String PayDate) {
        this.BookId = BookId;
        this.CusId = CusId;
        this.EmpId = EmpId;
        this.Name = Name;
        this.Amount = Amount;
        this.BorrowDate = BorrowDate;
        this.PayDate = PayDate;
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer BookId) {
        this.BookId = BookId;
    }

    public Integer getCusId() {
        return CusId;
    }

    public void setCusId(Integer CusId) {
        this.CusId = CusId;
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

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public String getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(String BorrowDate) {
        this.BorrowDate = BorrowDate;
    }

    public String getPayDate() {
        return PayDate;
    }

    public void setPayDate(String PayDate) {
        this.PayDate = PayDate;
    }

    @Override
    public String toString() {
        return "BorrowBook{" + "BookId=" + BookId + ", CusId=" + CusId + ", EmpId=" + EmpId + ", Name=" + Name + ", Amount=" + Amount + ", BorrowDate=" + BorrowDate + ", PayDate=" + PayDate + '}';
    }

   
}
