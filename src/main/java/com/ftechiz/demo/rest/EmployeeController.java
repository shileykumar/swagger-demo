package com.ftechiz.demo.rest;

import com.ftechiz.demo.domain.Employee;
import com.ftechiz.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("create")
    public Employee createEmployee(@RequestBody Employee employee) {
        Employee result = employeeService.save(employee);
        return result;
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee result = employeeService.update(employee);
        return result;
    }

    @GetMapping("/find")
    public List<Employee> findAll() {
       List<Employee> result = employeeService.findAll();
        return result;
    }

    @PatchMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        Employee result = employeeService.update(employee);
        return result;
    }
    @GetMapping("/find/{id}")
    public Employee findById(@PathVariable Long id) {
        Employee result = employeeService.findById(id);
        return result;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
