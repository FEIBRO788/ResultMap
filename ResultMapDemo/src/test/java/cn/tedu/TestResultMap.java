package cn.tedu;

import cn.tedu.mapper.TeacherMapper;
import cn.tedu.pojo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestResultMap {
    @Autowired
    TeacherMapper teacherMapper;
    @Test
    public void testGetTeacherById(){
        Teacher teacherById = teacherMapper.getTeacherById(2);
        System.out.println(teacherById);
    }

}
