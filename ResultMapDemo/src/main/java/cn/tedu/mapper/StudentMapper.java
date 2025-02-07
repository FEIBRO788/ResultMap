package cn.tedu.mapper;

import cn.tedu.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface StudentMapper {
    public List<Student> selectListByBirth1(@Param("minbirth") String min,@Param("maxbirth") String max);


}
