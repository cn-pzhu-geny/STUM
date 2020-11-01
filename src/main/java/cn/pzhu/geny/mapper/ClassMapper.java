package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(String classNo);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(String classNo);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}