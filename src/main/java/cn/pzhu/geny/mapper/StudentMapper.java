package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Activity;
import cn.pzhu.geny.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuNo);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuNo);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int selectCount();

    List<Student> selectTopStudent(int top);

    List<Activity> getActList(int stuNo);

    int updStuInfo(@Param("student") Student student);

}