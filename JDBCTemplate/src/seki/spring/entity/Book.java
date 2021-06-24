package seki.spring.entity;

import org.springframework.beans.factory.annotation.Value;

public class Book {

    @Value(value="123")
    private String bookId;
    @Value(value="Love is art")
    private String bookName ;
    @Value(value="true")
    private String bStatus ;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getbStatus() {
        return bStatus;
    }

    public void setbStatus(String bStatus) {
        this.bStatus = bStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bStatus='" + bStatus + '\'' +
                '}';
    }
}
