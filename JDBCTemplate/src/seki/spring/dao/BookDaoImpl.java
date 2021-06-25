package seki.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import seki.spring.entity.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate ;

    public void addBook(Book book){
        //先创建sql语句
        String sql = "insert into t_book values(?,?,?) " ;
        //执行语句
        int update = jdbcTemplate.update(sql,book.getBookId(),book.getBookName(),book.getbStatus()) ;
        System.out.println(update) ;
    }

    public void updateBook(Book book){
        String sql = "update t_book set bookname=?,bookstatus=? where bookid=?" ;
        int update = jdbcTemplate.update(sql,book.getBookName(),book.getbStatus(),book.getBookId()) ;
        System.out.println(update) ;
    }

    public void deleteBook(String id){
        String sql = "delete from t_book where bookid=?" ;
        int del = jdbcTemplate.update(sql,id) ;
        System.out.println(del) ;
    }

    //查询返回一个值
    public int findCount(){
        String sql = "select count(*) from t_book" ;
        //第二个参数是返回值的类型
        Integer cnt = jdbcTemplate.queryForObject(sql,Integer.class) ;
        return cnt ;
    }

    //返回一个对象
    public Book findOne(String id){
        String sql = "select * from t_book where bookid=?" ;
        //三个参数
        //第一个sql语句，第三个参数是？值
        //第二个参数是RowMapper接口，使用这个接口的实现类可以完成数据的封装
        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id) ;
        return book ;
    }

    public List<Book> findAll(){
        String sql = "select * from t_book" ;
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class)) ;
        return bookList ;
    }
}
