package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userNo);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userNo);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}