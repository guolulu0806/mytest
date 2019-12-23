package com.yz.dao;

import com.yz.entity.Gangwei;
import com.yz.entity.GangweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GangweiMapper {
    int countByExample(GangweiExample example);

    int deleteByExample(GangweiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gangwei record);

    int insertSelective(Gangwei record);

    List<Gangwei> selectByExample(GangweiExample example);

    Gangwei selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gangwei record, @Param("example") GangweiExample example);

    int updateByExample(@Param("record") Gangwei record, @Param("example") GangweiExample example);

    int updateByPrimaryKeySelective(Gangwei record);

    int updateByPrimaryKey(Gangwei record);
}