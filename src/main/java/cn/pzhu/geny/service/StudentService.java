package cn.pzhu.geny.service;

import cn.pzhu.geny.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selTopStudent(int top);
}
