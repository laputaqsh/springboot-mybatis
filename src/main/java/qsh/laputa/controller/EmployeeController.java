package qsh.laputa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qsh.laputa.entity.Employee;
import qsh.laputa.mapper.EmployeeMapper;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeMapper empMapper;

    @GetMapping("/all")
    public List<Employee> getAll() {
        return empMapper.getAll();
    }

    @GetMapping("/list")
    public List<Employee> getEmpsByDepId(@RequestParam("depId") Integer depId) {
        return empMapper.getEmpsByDepId(depId);
    }

    @GetMapping("/detail")
    public Employee getEmpById(@RequestParam("id") Integer id) {
        return empMapper.getEmpById(id);
    }

    @GetMapping("/details")
    public Employee getEmpWithDep(@RequestParam("id") Integer id) {
        return empMapper.getEmpWithDep(id);
    }

}
