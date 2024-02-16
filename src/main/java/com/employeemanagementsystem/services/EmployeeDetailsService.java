package com.employeemanagementsystem.services;

import com.employeemanagementsystem.entity.EmployeeDetails;

import java.util.List;
import java.util.Optional;

public interface EmployeeDetailsService {
    public List<EmployeeDetails> viewEmployee();

    public void insertEmployee(EmployeeDetails details);

    public void updateEmployee(EmployeeDetails details);

    public void deleteEmployeeById(int id);

    public Optional<EmployeeDetails> findEmployeeById(int id);
}
