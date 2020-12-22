package cn.pzhu.geny.service.impl;


import cn.pzhu.geny.mapper.UserMapper;
import cn.pzhu.geny.pojo.User;
import cn.pzhu.geny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private  UserMapper userMapper;
    public int deleteByPrimaryKey(Integer userNo) {
        return userMapper.deleteByPrimaryKey(userNo);
    }
    public int insert(User record) {
        return userMapper.insert(record);
    }
    public User selectByNopwd(Integer userNo, String password) {
        return userMapper.selectByNopwd(userNo,password);
    }
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
    public User selectByNo(Integer userNo) {
        return userMapper.selectByNo(userNo);
    }
}