package cn.pzhu.geny.service;

import cn.pzhu.geny.pojo.Student;
import cn.pzhu.geny.pojo.User;

public interface UserService {

    int deleteByPrimaryKey(Integer userNo);

    int insert(User record);

   // User insertSelective(User record);

    User selectByNopwd(Integer userNo,String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByNo(Integer userNo);

}
