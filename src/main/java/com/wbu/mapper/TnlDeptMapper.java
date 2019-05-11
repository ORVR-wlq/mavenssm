package com.wbu.mapper;

import com.wbu.entity.TnlDept;
import com.wbu.entity.TnlDeptExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TnlDeptMapper {
    int countByExample(TnlDeptExample example);

    int deleteByExample(TnlDeptExample example);

    int insert(TnlDept record);

    int insertSelective(TnlDept record);

    List<TnlDept> selectByExample(TnlDeptExample example);

    int updateByExampleSelective(@Param("record") TnlDept record, @Param("example") TnlDeptExample example);

    int updateByExample(@Param("record") TnlDept record, @Param("example") TnlDeptExample example);
}