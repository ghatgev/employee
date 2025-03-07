package com.example.salary.controller;

import com.example.salary.entity.Salary;
import com.example.salary.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salary")
public class SalaryController {
    
    @Autowired
    private SalaryService salaryService;

    @GetMapping("/{employeeId}")
    public List<Salary> getSalaryByEmployeeId(@PathVariable Long employeeId) {
        return salaryService.getSalariesByEmployeeId(employeeId);
    }

    @PostMapping("/save")
    public Salary saveSalary(@RequestBody Salary salary) {
        return salaryService.saveSalary(salary);
    }
}
