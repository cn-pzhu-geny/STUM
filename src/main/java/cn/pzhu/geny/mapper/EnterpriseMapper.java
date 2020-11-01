package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Enterprise;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer entNo);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer entNo);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}