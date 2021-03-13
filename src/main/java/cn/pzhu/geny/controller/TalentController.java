package cn.pzhu.geny.controller;

import cn.pzhu.geny.pojo.Student;
import cn.pzhu.geny.service.StudentService;
import cn.pzhu.geny.service.impl.StudentServiceImpl;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TalentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("getTalentList")
    @ResponseBody
    public String getTalentList(){
        int top=10;
        List<Student> studentList=studentService.selTopStudent(top);
        return JSON.toJSONString(studentList);
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "测试数据";
    }
}
