package com.employeemanagementsystem.services;

import com.employeemanagementsystem.entity.EmployeeDetails;
import com.employeemanagementsystem.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDetailsServiceImplementation implements EmployeeDetailsService{
    @Autowired
    EmployeeDetailsRepository repository;
    @Override
    public List<EmployeeDetails> viewEmployee() {
        return repository.findAll();
    }

    @Override
    public void insertEmployee(EmployeeDetails details) {
        repository.save(details);
    }

    @Override
    public void updateEmployee(EmployeeDetails details) {
        repository.save(details);
    }

    @Override
    public void deleteEmployeeById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<EmployeeDetails> findEmployeeById(int id) {
        return repository.findById(id);
    }
}
