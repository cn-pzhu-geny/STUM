package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}