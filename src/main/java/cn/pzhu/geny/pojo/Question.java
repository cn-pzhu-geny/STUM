package cn.pzhu.geny.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * question
 * @author 
 */
@Data
public class Question implements Serializable {
    private Integer quesId;

    private String quesTitle;

    private String quesDesc;

    private Date quesCreateTime;

    private String quesCreateUser;

    private String quesType;

    private String quesPic;

    private static final long serialVersionUID = 1L;
}