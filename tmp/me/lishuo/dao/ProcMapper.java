package me.lishuo.dao;

import me.lishuo.model.Proc;
import me.lishuo.model.ProcKey;
import me.lishuo.model.ProcWithBLOBs;

public interface ProcMapper {
    int deleteByPrimaryKey(ProcKey key);

    int insert(ProcWithBLOBs record);

    int insertSelective(ProcWithBLOBs record);

    ProcWithBLOBs selectByPrimaryKey(ProcKey key);

    int updateByPrimaryKeySelective(ProcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProcWithBLOBs record);

    int updateByPrimaryKey(Proc record);
}