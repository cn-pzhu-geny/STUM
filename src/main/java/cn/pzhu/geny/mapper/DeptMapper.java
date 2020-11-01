package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptNo);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptNo);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}