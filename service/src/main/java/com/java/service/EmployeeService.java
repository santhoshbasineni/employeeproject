package com.java.service;

import com.java.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee postEmployee(Employee employee);

    public Employee getEmployee(int id);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
