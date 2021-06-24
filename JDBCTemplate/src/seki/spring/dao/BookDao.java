package seki.spring.dao;

import seki.spring.entity.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book) ;
    void deleteBook(String id) ;
    void updateBook(Book book) ;
    int findCount() ;
    Book findOne(String id) ;
    List<Book> findAll() ;
}
