package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * teacher
 * @author 
 */
@Data
public class Teacher implements Serializable {
    /**
     * 教职工号
     */
    private Integer teaNo;

    /**
     * 身份证号
     */
    private String teaId;

    /**
     * 教职工姓名
     */
    private String teaName;

    /**
     * 教职工性别
     */
    private String teaSex;

    /**
     * 教职工联系方式
     */
    private String teaContact;

    public Integer getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(Integer teaNo) {
        this.teaNo = teaNo;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    public String getTeaContact() {
        return teaContact;
    }

    public void setTeaContact(String teaContact) {
        this.teaContact = teaContact;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaNo=" + teaNo +
                ", teaId='" + teaId + '\'' +
                ", teaName='" + teaName + '\'' +
                ", teaSex='" + teaSex + '\'' +
                ", teaContact='" + teaContact + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}