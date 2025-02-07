package cn.tedu;

import cn.tedu.mapper.SubjectMapper;
import cn.tedu.mapper.TeacherMapper;
import cn.tedu.pojo.Subject;
import cn.tedu.pojo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestResultMap {
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    SubjectMapper subjectMapper;
    @Test
    public void testGetTeacherById(){
        Teacher teacherById = teacherMapper.getTeacherById(2);
        System.out.println(teacherById);
    }
    @Test
    public void testSelectTeacherSubjectById(){
        Teacher teacher = teacherMapper.selectTeacherSubjectById(3);
        System.out.println(teacher);
    }
    @Test
    public void testgetSubjectTeacherByName(){
        Subject subject = subjectMapper.getSubjectTeacherByName("语文");
        System.out.println(subject);


    }

}
