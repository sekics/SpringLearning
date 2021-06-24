package seki.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seki.spring.dao.BookDao;
import seki.spring.entity.Book;

import java.util.List;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao ;

    public void addBook(Book book){
        bookDao.addBook(book) ;
    }

    public void updateBook(Book book){
        bookDao.updateBook(book) ;
    }

    public void deleteBook(String id){
        bookDao.deleteBook(id) ;
    }

    public int findCount(){
        return bookDao.findCount() ;
    }

    public Book findOne(String id){
        return bookDao.findOne(id) ;
    }

    public List<Book> findAll(){
        return bookDao.findAll() ;
    }
}
