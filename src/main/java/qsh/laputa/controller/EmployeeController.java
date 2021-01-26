package qsh.laputa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qsh.laputa.entity.Employee;
import qsh.laputa.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    //查询全部的商品信息
    @GetMapping("/emp/list")
    public List<Employee> selectAll() {
        return empService.selectAll();
    }

    @GetMapping("/emp/list")
    public Employee getEmpById() {

    }

}
