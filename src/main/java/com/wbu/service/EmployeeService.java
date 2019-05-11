package com.wbu.service;

import com.wbu.entity.TblEmp;

import java.util.List;

public interface EmployeeService {
    public String findall();

    List<TblEmp> selectAllByEmp();
}
