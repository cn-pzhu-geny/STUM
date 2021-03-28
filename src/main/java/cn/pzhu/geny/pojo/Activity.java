package cn.pzhu.geny.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * activity
 * @author 
 */
@Data
public class Activity implements Serializable {
    /**
     * 活动编号
     */
    private Integer actId;

    /**
     * 活动名称
     */
    private String actName;

    /**
     * 活动内容描述
     */
    private String actDescr;

    /**
     * 开始时间
     */
    private Date actStart;

    /**
     * 截至时间
     */
    private Date actEnd;

    /**
     * 活动分数
     */
    private Double actScore;

    /**
     * 活动管理教师
     */
    private Integer actTeaNo;

    private List<Score> scoreList;
    private static final long serialVersionUID = 1L;
}