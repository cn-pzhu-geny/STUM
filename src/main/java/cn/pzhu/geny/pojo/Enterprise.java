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

    public Integer getEntNo() {
        return entNo;
    }

    public void setEntNo(Integer entNo) {
        this.entNo = entNo;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "entNo=" + entNo +
                ", entName='" + entName + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}