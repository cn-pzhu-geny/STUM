package cn.pzhu.geny.controller;

import cn.pzhu.geny.pojo.User;
import cn.pzhu.geny.service.UserService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UsersController {
    private final int ADMIN_PERMISSION=1;
    private final int TEACHER_PERMISSION=2;
    private final int STUDENT_PERMISSION=3;
    private final int ENTERPRISE_PERMISSION=4;

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("register")
    public String UserReg(User user, MultipartFile headpath, HttpServletRequest req) {
        int index = -1;
        String filename = headpath.getOriginalFilename();//文件名代表上传的文件名。
        System.out.println(filename);
        String suffix = filename.substring(filename.lastIndexOf("."));
        if (suffix.equalsIgnoreCase(".jpg") || suffix.equalsIgnoreCase(".png")) {
            String path = req.getServletContext().getRealPath("files");
            System.out.println("path");
            String uuid = UUID.randomUUID().toString();
            String filepath = path + "/" + uuid + suffix;
            //System.out.println(filepath);
            //InputStream inputStream = file.getInputStream();
            try {
                FileUtils.copyInputStreamToFile(headpath.getInputStream(), new File(filepath));//文件上传

                user.setHeadPath(uuid + suffix);
                User user1 = userServiceImpl.selectByNo(user.getUserNo());
                if(user1!=null)
                {req.setAttribute("error","该用户以注册");
                return "redirect:/reg.jsp";}
                index = userServiceImpl.insert(user);
                if (index > 0) {
                    System.out.println("注册成功");
                    return "redirect:/newlogin.html";
                } else {
                    System.out.println("注册失败");
                    return "redirect:/reg.jsp";
                }
            } catch (IOException e) {
                e.printStackTrace();
                return "redirect:/reg.jsp";
            }
        } else {
            return "redirect:/reg.jsp";
        }
    }

    @RequestMapping("login")
    public String login(String userno, String password, HttpServletRequest req, HttpServletResponse resp) {
        int userno1 = Integer.parseInt(userno);
        System.out.println(userno + ":" + password);
        User u = userServiceImpl.selectByNopwd(userno1, password);
        System.out.println(userno1 + ":" + password);
        if (u != null) {
            Cookie cookie1 = new Cookie("uid", String.valueOf(u.getUserNo()));
            cookie1.setPath("STUM");
            resp.addCookie(cookie1);
            if (u.getPermission() == STUDENT_PERMISSION) {
                Cookie cookie = new Cookie("status", String.valueOf(STUDENT_PERMISSION));
                cookie.setPath("STUM");
                resp.addCookie(cookie);
                return "redirect:/index.html";
            }
            if (u.getPermission() == ADMIN_PERMISSION) {
                Cookie cookie = new Cookie("status", String.valueOf(ADMIN_PERMISSION));
                cookie.setPath("STUM");
                resp.addCookie(cookie);
                return "redirect:/stuMain.jsp";
            }
            if (u.getPermission() == ENTERPRISE_PERMISSION) {
                Cookie cookie = new Cookie("status", String.valueOf(ENTERPRISE_PERMISSION));
                cookie.setPath("STUM");
                resp.addCookie(cookie);
                return "redirect:/stuMain.jsp";
            }
            if (u.getPermission() == TEACHER_PERMISSION) {
                Cookie cookie = new Cookie("status", String.valueOf(TEACHER_PERMISSION));
                cookie.setPath("STUM");
                resp.addCookie(cookie);
                return "redirect:/stuMain.jsp";
            }
        }
        return "redirect:/newlogin.html";
    }


}