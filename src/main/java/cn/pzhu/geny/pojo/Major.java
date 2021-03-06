package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * major
 * @author 
 */
@Data
public class Major implements Serializable {
    /**
     * 专业编号
     */
    private Integer majorId;

    /**
     * 专业名
     */
    private String majorName;

    /**
     * 专业归属学院
     */
    private Integer majorDeptNo;

    private static final long serialVersionUID = 1L;
}