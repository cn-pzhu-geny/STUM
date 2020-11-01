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

    private static final long serialVersionUID = 1L;
}