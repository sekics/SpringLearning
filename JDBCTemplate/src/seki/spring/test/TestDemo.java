package seki.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import seki.spring.entity.Book;
import seki.spring.service.BookService;

public class TestDemo {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml") ;
        BookService bookService = context.getBean("bookService",BookService.class) ;
//        Book book = new Book() ;
//        book.setBookId("1234");
//        book.setBookName("Love is art II");
//        book.setbStatus("false");
//        System.out.println(book.getBookId()) ;
//        bookService.addBook(book);
//        bookService.updateBook(book);
//        bookService.deleteBook("12345");
        int cnt = bookService.findCount() ;
        System.out.println(cnt);
        String id = "123" ;
        System.out.println( bookService.findOne(id).toString() ) ;
    }
}
