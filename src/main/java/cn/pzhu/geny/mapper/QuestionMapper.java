package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Question;

import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer quesId);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectAll();


    Question selQuestionByQid(int qid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}