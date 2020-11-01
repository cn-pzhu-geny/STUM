package cn.pzhu.geny.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 学号/教职工号/企业号
     */
    private Integer userNo;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 权限等级
     */
    private Integer permission;

    /**
     * 头像图片存储路径
     */
    private String headPath;

    private static final long serialVersionUID = 1L;
}