package com.java.controller;

import com.java.domain.Employee;
import com.java.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getDoctor(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public Employee postEmployee(Employee employee){
        return employeeService.postEmployee(employee);
    }
    @GetMapping("employeeById")
    public Employee getEmployee(int id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/updateEmployee")
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/delete")
    public void deleteEmployee(int id){
        employeeService.deleteEmployee(id);
    }

}
