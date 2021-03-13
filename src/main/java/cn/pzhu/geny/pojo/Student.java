package cn.pzhu.geny.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * student
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

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

    /**
     * 个人简介
     */
    private String stuInfo;
}