package cn.pzhu.geny.service.impl;

import cn.pzhu.geny.mapper.StudentMapper;
import cn.pzhu.geny.pojo.Activity;
import cn.pzhu.geny.pojo.Student;
import cn.pzhu.geny.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selTopStudent(int top) {
        return studentMapper.selectTopStudent(top);
    }

    @Override
    public List<Activity> getActList(int stuNo) {
        return studentMapper.getActList(stuNo);
    }

    @Override
    public int updStuInfo(Student student) {
        return studentMapper.updStuInfo(student);
    }

    @Override
    public Student selStudentByNo(int stuNo) {
        return studentMapper.selectByPrimaryKey(stuNo);
    }
}
