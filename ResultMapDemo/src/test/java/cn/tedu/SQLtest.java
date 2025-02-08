package cn.tedu;

import cn.tedu.mapper.StudentMapper;
import cn.tedu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
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
    @Test
    public void testSelectListrByBirth2(){
        String minBirth = null;
        String maxBirth = "2017-06-16";
        List<Student> students = studentMapper.selectListByBirth2(minBirth, maxBirth);
        for (Student student : students) {
            System.out.println(student);
        }

    }
    @Test
    public void testSelectListrByBirth3(){
        String minBirth = "2014-04-13";
        String maxBirth = "2017-06-16";
        List<Student> students = studentMapper.selectListByBirth3(minBirth, maxBirth);
        for (Student student : students) {
            System.out.println(student);
        }

    }
    @Test
    public void testdeleteStudentById1(){
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(6);
        integers.add(7);
        int i = studentMapper.deleteStudentById1(integers);
        System.out.println("delete"+ i+"rows");
    }
    @Test
    public void testTraditionalUpdate(){
        Student student = new Student();
        student.setId(1);
        student.setName("JSDVN2310班修改");
        int i = studentMapper.updateStudentById(student);
        System.out.println(i);
    }
    @Test
    public void testUpdateStudentByDynamicUpdate(){

        Student student = new Student();
        student.setId(2);
        student.setName("马");
        student.setAge(9);
        student.setBirth(null);
        student.setGender("男");
        student.setClassId(0);
        student.setLocationId(0);
        student.setTeamLeader(0);
        int i = studentMapper.updateStudentByDynamicUpdate(student);

        System.out.println(i);
    }
}
