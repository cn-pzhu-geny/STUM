package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Student;
import cn.pzhu.geny.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userNo);

    int insert(User record);

    User insertSelective(User record);

    User selectByNopwd(@Param("userNo")Integer userNo, @Param("password")String password);//登录

    int updateByPrimaryKeySelective(User record);

     User selectByNo(Integer userNo);//学生

     User selectByNo1(Integer userNo);//老师

     User selectByNo2(Integer userNo);//企业


}