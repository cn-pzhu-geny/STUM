package cn.pzhu.geny.service.impl;

import cn.pzhu.geny.mapper.MessageMapper;
import cn.pzhu.geny.mapper.QuestionMapper;
import cn.pzhu.geny.pojo.Message;
import cn.pzhu.geny.pojo.Question;
import cn.pzhu.geny.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ForumServiceImpl implements ForumService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<Question> selAll() {
        return questionMapper.selectAll();
    }

    @Override
    public Question getQuestion(int qid) {
        return questionMapper.selQuestionByQid(qid);
    }

    @Override
    public List<Message> getAllMessage(int qid) {
        return messageMapper.selectByPrimaryKey(qid);
    }
}
