package org.fApp.controller;


import org.fApp.model.Employee;
import org.fApp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    public EmpService empService;

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam Integer id){
        return this.empService.getUser(id);
     }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.empService.getAllUsers();
    }

     @PostMapping( "/save")
     public Employee addEmployee(@RequestBody Employee employee){
         return this.empService.save(employee);
    }

    @PutMapping("/edit")
    public Employee editEmployee(@RequestBody Employee employee){

        return this.empService.edit(employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestParam Integer id){
        this.empService.delete(id);
    }



}
