package com.arun.ms.firstapp.service;

import com.arun.ms.firstapp.model.Employee;
import com.arun.ms.firstapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee addEmployee(Employee emp) {
        return repository.save(emp);
    }
}