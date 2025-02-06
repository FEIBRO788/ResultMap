package cn.tedu.mapper;

import cn.tedu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
//操作数据库的mapper层
@Repository
public interface TeacherMapper {
    public Teacher getTeacherById(@Param("id") Integer id);
//    public Teacher getTeacherSubjectById(Integer id);
//    public Teacher selectTeacherSubjectById(Integer id);
}
