package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seki.spring.pojo.Student;
import seki.spring.pojo.Teacher;
import seki.spring.util.MybatisUtil;

import java.util.List;

public class TestDemo {

    @Test
    public void testTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class) ;
        List<Teacher> teachers = teacherMapper.getTeachers() ;
        for( Teacher teacher : teachers ){
            System.out.println(teacher.toString()) ;
        }
        sqlSession.close() ;
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class) ;
        List<Student> students = studentMapper.getStudents() ;
        for(Student student : students ){
            System.out.println(student.toString()) ;
        }
        sqlSession.close() ;
    }
}
