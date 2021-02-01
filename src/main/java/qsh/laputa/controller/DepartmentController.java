package qsh.laputa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import qsh.laputa.entity.Department;
import qsh.laputa.mapper.DepartmentMapper;

import java.util.List;

@RestController
@RequestMapping("/dep")
public class DepartmentController {

    @Autowired
    private DepartmentMapper depMapper;

    @GetMapping("/all")
    public List<Department> getAll() {
        return depMapper.getAll();
    }

    @GetMapping("/detail")
    public Department getDepById(@RequestParam("id") Integer id) {
        return depMapper.getDepById(id);
    }

    @GetMapping("/details")
    public Department getDepWithEmps(@RequestParam("id") Integer id) {
        return depMapper.getDepWithEmps(id);
    }

}
