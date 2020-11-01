package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuNo);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuNo);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}