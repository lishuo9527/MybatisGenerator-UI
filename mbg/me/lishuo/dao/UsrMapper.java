package me.lishuo.dao;

import me.lishuo.model.Usr;

public interface UsrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usr record);

    int insertSelective(Usr record);

    Usr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);
}