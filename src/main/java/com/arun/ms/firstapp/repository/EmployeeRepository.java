package com.arun.ms.firstapp.repository;

import com.arun.ms.firstapp.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> findAll() {
        return employees;
    }

    public Employee save(Employee emp) {
        employees.add(emp);
        return emp;
    }
}