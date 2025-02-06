package cn.tedu.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Subject {
    private Integer id;
    private String name;
    //科目信息中,可能包含多条老师信息,所以声明List属性
    private List<Teacher> teachers;
}
