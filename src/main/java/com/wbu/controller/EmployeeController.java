package com.wbu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wbu.entity.Msg;
import com.wbu.entity.TblEmp;
import com.wbu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/test")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/findallemp")
    public String findallemp(@RequestParam(value = "pn",defaultValue = "1")Integer pn, HttpServletRequest request, HttpServletResponse response){
        System.out.print("成功打印");
        PageHelper.startPage(pn,5);
        List<TblEmp> allemp = employeeService.selectAllByEmp();

        PageInfo page = new PageInfo(allemp,5);
        //request.setAttribute("page",page);

        return "list";
    }

    @RequestMapping("/findaJason")
    @ResponseBody
    public Msg findaJason(@RequestParam(value = "pn",defaultValue = "1")Integer pn, HttpServletRequest request, HttpServletResponse response){
        System.out.print("成功打印");
        PageHelper.startPage(pn,5);
        List<TblEmp> allemp = employeeService.selectAllByEmp();

        PageInfo page = new PageInfo(allemp,5);
        //request.setAttribute("page",page);

        return Msg.success().add("page",page);
    }
}
