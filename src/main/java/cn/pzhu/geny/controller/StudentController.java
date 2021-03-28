package cn.pzhu.geny.controller;

import cn.pzhu.geny.pojo.Activity;
import cn.pzhu.geny.pojo.Student;
import cn.pzhu.geny.service.StudentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("getTalentList")
    @ResponseBody
    public String getTalentList(){
        int top=10;
        List<Student> studentList=studentService.selTopStudent(top);
        return JSON.toJSONString(studentList);
    }

    @RequestMapping("search")
    @ResponseBody
    public ModelAndView getDetail(int stuNo, HttpServletRequest req){
        System.out.println("进入");
        String unLogin ="-1";
        Cookie []cookieArr=req.getCookies();
        String status=unLogin;
        if (cookieArr.length>0){
            for (Cookie cookie:cookieArr) {
                if ("status".equals(cookie.getName())){
                    status=cookie.getValue();
                }
            }
        }
        System.out.println(status);
        ModelAndView mv=new ModelAndView();
        if (!unLogin.equals(status)){
            List<Activity> list = studentService.getActList(stuNo);
            mv.setViewName("markList.jsp");
            mv.addObject("list",list);
            return mv;
        }
        System.out.println("不能查看");
        mv.setViewName("talentShow.html");
        return mv;
    }

    @RequestMapping("update")
    public String updateInfo(String stuInfo,String stuCont,HttpServletRequest request){
        Cookie []cookies=request.getCookies();
        String uid=null;
        for (Cookie cookie:cookies) {
            if (cookie.getName().equals("uid")){
                uid=cookie.getValue();
            }
        }
        Student student = new Student();
        student.setStuNo(Integer.parseInt(uid));
        student.setStuInfo(stuInfo);
        student.setStuContact(stuCont);
        System.out.println(studentService.updStuInfo(student));
        return "redirect:/getinfo";
    }

    @RequestMapping("getinfo")
    public ModelAndView getStuInfo(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        Cookie []cookies=request.getCookies();
        String uid=null;
        for (Cookie cookie:cookies) {
            if (cookie.getName().equals("uid")){
                uid=cookie.getValue();
            }
        }
        Student student=studentService.selStudentByNo(Integer.parseInt(uid));
        System.out.println(student);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("personInfo.jsp");
        return modelAndView;
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "测试数据";
    }
}
