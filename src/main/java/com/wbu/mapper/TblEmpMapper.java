package com.wbu.mapper;

import com.wbu.entity.TblEmp;
import com.wbu.entity.TblEmpExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblEmpMapper {
    int countByExample(TblEmpExample example);

    int deleteByExample(TblEmpExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(TblEmp record);

    int insertSelective(TblEmp record);

    List<TblEmp> selectByExample(TblEmpExample example);

    TblEmp selectByPrimaryKey(Integer empId);

    List<TblEmp> selectByExamplewithdept(TblEmpExample example);

    TblEmp selectByPrimaryKeywithdept(Integer empId);

    int updateByExampleSelective(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByExample(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByPrimaryKeySelective(TblEmp record);

    int updateByPrimaryKey(TblEmp record);
}