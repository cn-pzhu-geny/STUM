package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * dept
 * @author 
 */
@Data
public class Dept implements Serializable {
    /**
     * 学院编号
     */
    private Integer deptNo;

    /**
     * 学院名
     */
    private String deptName;

    private static final long serialVersionUID = 1L;
}