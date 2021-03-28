package cn.pzhu.geny.service.impl;


import cn.pzhu.geny.mapper.UserMapper;
import cn.pzhu.geny.pojo.User;
import cn.pzhu.geny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {


    @Autowired
    private  UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Integer userNo) {
        return userMapper.deleteByPrimaryKey(userNo);
    }
    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
    @Override
    public User selectByNopwd(Integer userNo, String password) {
        return userMapper.selectByNopwd(userNo,password);
    }
    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public User selectByNo(Integer userNo) {
        return userMapper.selectByNo(userNo);
    }
}