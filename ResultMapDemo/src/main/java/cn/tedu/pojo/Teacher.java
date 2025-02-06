package cn.tedu.pojo;

import lombok.Data;

@Data
public class Teacher {
    private Integer id;
    private String name;
    private Integer age;
    private String title;
    private Integer manager;
    private Integer salary;
    private Integer comm;
    private String gender;
    private Integer subjectId;
    // 添加  subject 属性
    private Subject subject;
}
