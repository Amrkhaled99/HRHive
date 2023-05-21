package org.fApp.service;

import org.fApp.model.Employee;
import org.fApp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee getUser(Integer id){

        Optional<Employee> emp=this.employeeRepo.findById(id);
        return emp.orElse(null);
    }


    public List<Employee> getAllUsers(){
        return this.employeeRepo.findAll();
    }

    public Employee save(Employee employee) {
        Employee emp=this.employeeRepo.save(employee);
        return  emp;
    }

    public Employee edit(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    public void  delete(Integer id){
        this.employeeRepo.deleteById(id);
    }
}
