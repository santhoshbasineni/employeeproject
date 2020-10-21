package com.java.service;

import com.java.domain.Employee;
import com.java.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @PostConstruct
    public void initEmployee() {

        employeeRepo.saveAll(Stream.of
                (
                        new Employee(1,"Suresh", "kumar", "IT", LocalDateTime.of(2000, 12, 01, 12, 1), "M"),
                        new Employee(2,"Santhosh", "Rao", "EEE", LocalDateTime.of(2001, 12, 01, 12, 1), "M"),
                        new Employee(3,"Monica", "Rao", "ECE", LocalDateTime.of(2002, 12, 01, 12, 1), "F"),
                        new Employee(4,"Priya", "Rani", "MEC", LocalDateTime.of(2003, 12, 01, 12, 1), "F")
                        ).collect(Collectors.toList()));

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee postEmployee(Employee employee) {
        return employeeRepo.saveAll(Stream.of(employee).collect(Collectors.toList())).get(0);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepo.findByEmployeeId(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.saveAll(Stream.of(employee).collect(Collectors.toList())).get(0);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.delete(getEmployee(id));
    }
}
