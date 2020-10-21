package com.java.repo;

import com.java.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    public List<Employee> findAll();

    public Employee findByEmployeeId(@Param("employeeId") int employeeId);
}
