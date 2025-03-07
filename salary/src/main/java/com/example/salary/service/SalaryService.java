package com.example.salary.service;

import com.example.salary.entity.Salary;
import com.example.salary.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {
    
    @Autowired
    private SalaryRepository salaryRepository;

    public List<Salary> getSalariesByEmployeeId(Long employeeId) {
        return salaryRepository.findByEmployeeId(employeeId);
    }

    public Salary saveSalary(Salary salary) {
        return salaryRepository.save(salary);
    }
}
