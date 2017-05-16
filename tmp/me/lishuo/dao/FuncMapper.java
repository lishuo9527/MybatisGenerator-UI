package me.lishuo.dao;

import me.lishuo.model.Func;

public interface FuncMapper {
    int deleteByPrimaryKey(String name);

    int insert(Func record);

    int insertSelective(Func record);

    Func selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Func record);

    int updateByPrimaryKey(Func record);
}