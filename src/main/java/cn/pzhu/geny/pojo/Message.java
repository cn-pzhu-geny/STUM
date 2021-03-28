package cn.pzhu.geny.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * message
 * @author 
 */
@Data
public class Message implements Serializable {
    /**
     * 消息编号
     */
    private Integer messageId;

    /**
     * 发送用户
     */
    private Integer userNo;

    /**
     * 接受用户
     */
    private Integer toUserNo;

    /**
     * 信息内容
     */
    private String message;

    /**
     * 发送时间
     */
    private Date createTime;

    private int qid;

    private static final long serialVersionUID = 1L;
}