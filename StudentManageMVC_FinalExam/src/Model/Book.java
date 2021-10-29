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
public class Book {

    private Integer BookId;
    private String Name;
    private String Category;
    private Integer Amount;
    private String Status;

    public Book() {
    }

    public Book(Integer BookId, String Name, String Category, Integer Amount, String Status) {
        this.BookId = BookId;
        this.Name = Name;
        this.Category = Category;
        this.Amount = Amount;
        this.Status = Status;
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer BookId) {
        this.BookId = BookId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Book{" + "BookId=" + BookId + ", Name=" + Name + ", Category=" + Category + ", Amount=" + Amount + ", Status=" + Status + '}';
    }

}
