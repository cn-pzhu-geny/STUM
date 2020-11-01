package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * score
 * @author 
 */
@Data
public class Score implements Serializable {
    /**
     * 活动id
     */
    private Integer actId;

    /**
     * 参与人号码
     */
    private Integer userNo;

    /**
     * 得分情况
     */
    private Integer score;

    private static final long serialVersionUID = 1L;
}