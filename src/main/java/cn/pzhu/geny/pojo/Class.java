package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * class
 * @author 
 */
@Data
public class Class implements Serializable {
    /**
     * 班级编号
     */
    private String classNo;

    /**
     * 班级所属专业
     */
    private Integer classMajorNo;

    /**
     * 班级归属教师
     */
    private Integer classTeaNo;

    private static final long serialVersionUID = 1L;
}