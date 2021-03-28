package cn.pzhu.geny.service;

import cn.pzhu.geny.pojo.Activity;
import cn.pzhu.geny.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selTopStudent(int top);
    List<Activity> getActList(int stuNo);
    int updStuInfo(Student student);
    Student selStudentByNo(int stuNo);
}
