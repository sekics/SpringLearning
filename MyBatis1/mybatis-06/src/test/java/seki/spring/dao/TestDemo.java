package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seki.spring.pojo.Teacher;
import seki.spring.util.MybatisUtil;

import java.util.List;

public class TestDemo {

    @Test
    public void testTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class) ;
        List<Teacher> teachers = teacherMapper.getTeacherList() ;
        for(Teacher teacher : teachers){
            System.out.println(teacher.toString()) ;
        }
        sqlSession.close();
    }

    @Test
    public void testTeacherById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class) ;
        Teacher teacher = teacherMapper.getTeacherById(1) ;
        System.out.println(teacher.toString()) ;
        sqlSession.close() ;
    }
}
