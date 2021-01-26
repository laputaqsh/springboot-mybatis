package qsh.laputa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qsh.laputa.mapper.EmployeeMapper;
import qsh.laputa.entity.Employee;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper empMapper;

    public List<Employee> selectAll() {
        return empMapper.selectAll();
    }

    public void insertEmp(Employee emp) {
        empMapper.insertEmp(emp);
    }

    public void updateEmp(Employee emp) {
        empMapper.updateEmp(emp);
    }

    public void deleteEmp(Integer id) {
        empMapper.deleteEmp(id);
    }

    public Employee getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    public Employee getEmpWithDep(Integer id) {
        return empMapper.getEmpWithDep(id);
    }

}
