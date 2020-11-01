package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * student
 * @author 
 */
@Data
public class Student implements Serializable {
    /**
     * 学号
     */
    private Integer stuNo;

    /**
     * 唯一身份符
     */
    private String stuId;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 性别
     */
    private String stuSex;

    /**
     * 联系方式
     */
    private String stuContact;

    /**
     * 班级
     */
    private String stuClass;

    private static final long serialVersionUID = 1L;
}