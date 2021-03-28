package cn.pzhu.geny.controller;

import cn.pzhu.geny.pojo.Message;
import cn.pzhu.geny.pojo.Question;
import cn.pzhu.geny.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ForumController {
    @Autowired
    private ForumService forumServiceImpl;
    @RequestMapping("forum")
    public ModelAndView getAllQuestion(){
        ModelAndView modelAndView = new ModelAndView();
        List<Question> questions =forumServiceImpl.selAll();
        modelAndView.addObject("questions",questions);
        System.out.println(questions);
        modelAndView.setViewName("forum.jsp");
        return modelAndView;
    }

    @RequestMapping("forummore")
    public ModelAndView getAllAnswer(String qid){
        ModelAndView modelAndView = new ModelAndView();
        Question question=forumServiceImpl.getQuestion(Integer.parseInt(qid));
        modelAndView.addObject("question",question);
        List<Message> messages=forumServiceImpl.getAllMessage(Integer.parseInt(qid));
        modelAndView.addObject("messages",messages);
        System.out.println(messages);
        modelAndView.setViewName("forummore.jsp");
        return modelAndView;
    }
}
