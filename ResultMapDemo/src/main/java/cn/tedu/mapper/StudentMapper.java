package cn.tedu.mapper;

import cn.tedu.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface StudentMapper {
    public List<Student> selectListByBirth1(@Param("minbirth") String min,@Param("maxbirth") String max);
    public List<Student> selectListByBirth2(@Param("minbirth") String minbirth,@Param("maxbirth") String maxbirth);
    public List<Student> selectListByBirth3(@Param("minbirth") String minbirth,@Param("maxbirth") String maxbirth);
    public int deleteStudentById1( List<Integer> ids);
    public int deleteStudentById2(Integer[] ids);
    public int updateStudentById(Student student);
    public int updateStudentByDynamicUpdate(Student student);



}
