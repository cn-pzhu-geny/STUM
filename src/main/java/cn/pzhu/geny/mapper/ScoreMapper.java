package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Score;


public interface ScoreMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}