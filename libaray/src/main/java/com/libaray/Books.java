package com.libaray;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// annotation
@Entity
@Table(name = "book_info")  // You can change table name as needed
public class Books {

    // fields
    // primary key field with auto-generation
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookid")
    private int bookId;

    @Column(name = "bookname")
    private String bookName;

    // constructor
    public Books(int bookId, String bookName) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
    }

    // default constructor (required by Hibernate)
    public Books() {}

    // getters and setters
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // toString method
    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
    }
}
