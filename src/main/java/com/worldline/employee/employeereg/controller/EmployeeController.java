package com.worldline.employee.employeereg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.worldline.employee.employeereg.entity.Employee;
import com.worldline.employee.employeereg.repository.EmployeeRepository;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @CrossOrigin
    @GetMapping("/get-details")
    public List<Employee> getdetails(){
        return employeeRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/post-details")
    public Employee postdetails(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
