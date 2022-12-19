package com.ftechiz.demo.service;

import com.ftechiz.demo.domain.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    Employee update(Employee employee);
    List<Employee> findAll();
    Employee findById(Long id);
    void delete(Long id);
}
