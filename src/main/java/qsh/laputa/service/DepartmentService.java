package qsh.laputa.service;

import org.springframework.beans.factory.annotation.Autowired;
import qsh.laputa.entity.Department;
import qsh.laputa.mapper.DepartmentMapper;

public class DepartmentService {

    @Autowired
    private DepartmentMapper depMapper;

    public Department getDepWithEmps(Integer id) {
        return depMapper.getDepWithEmps(id);
    }

}
