package com.wbu.service.impl;

import com.wbu.entity.TblEmp;
import com.wbu.entity.TnlDept;
import com.wbu.mapper.TblEmpMapper;
import com.wbu.mapper.TnlDeptMapper;
import com.wbu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    TblEmpMapper tblEmpMapper;
    @Autowired
    TnlDeptMapper tnlDeptMapper;

    public String findall() {
        return tblEmpMapper.selectByPrimaryKey(1).toString();
    }

    @Override
    public List<TblEmp> selectAllByEmp() {
        List<TblEmp> allEmp =  tblEmpMapper.selectByExamplewithdept(null);
        return allEmp;
    }
}
