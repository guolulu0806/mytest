package com.yz.dao;

import com.yz.entity.Jigou;
import com.yz.entity.JigouExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JigouMapper {
    int countByExample(JigouExample example);

    int deleteByExample(JigouExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jigou record);

    int insertSelective(Jigou record);

    List<Jigou> selectByExample(JigouExample example);

    Jigou selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jigou record, @Param("example") JigouExample example);

    int updateByExample(@Param("record") Jigou record, @Param("example") JigouExample example);

    int updateByPrimaryKeySelective(Jigou record);

    int updateByPrimaryKey(Jigou record);
}