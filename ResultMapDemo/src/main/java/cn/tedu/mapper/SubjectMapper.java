package cn.tedu.mapper;

import cn.tedu.pojo.Subject;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMapper {
    public Subject getSubjectTeacherByName(String name);


}
