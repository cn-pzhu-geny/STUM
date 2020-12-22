package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * student
 * @author 
 */
@Data
public class Student implements Serializable {



    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuContact() {
        return stuContact;
    }

    public void setStuContact(String stuContact) {
        this.stuContact = stuContact;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

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

    public Student(){

    }
    public Student(int stuNo) {
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuContact='" + stuContact + '\'' +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}