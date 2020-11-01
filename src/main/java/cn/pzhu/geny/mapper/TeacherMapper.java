package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teaNo);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaNo);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}