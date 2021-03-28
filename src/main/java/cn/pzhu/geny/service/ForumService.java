package cn.pzhu.geny.service;

import cn.pzhu.geny.pojo.Message;
import cn.pzhu.geny.pojo.Question;

import java.util.List;

public interface ForumService {
    List<Question> selAll();
    Question getQuestion(int qid);
    List<Message> getAllMessage(int qid);
}
