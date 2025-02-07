package cn.tedu;

import cn.tedu.mapper.StudentMapper;
import cn.tedu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SQLtest {
    @Autowired
    StudentMapper studentMapper;
    @Test
    public void testSelectListByBirth1(){
        List<Student> students = studentMapper.selectListByBirth1(new String("2015-06-16"), new String("2015-07-16"));
        for (Student student:students){
            System.out.println(student);
        }
    }
}
