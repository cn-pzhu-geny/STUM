package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * enterprise
 * @author 
 */
@Data
public class Enterprise implements Serializable {
    /**
     * 企业编号
     */
    private Integer entNo;

    /**
     * 企业名
     */
    private String entName;

    private static final long serialVersionUID = 1L;
}