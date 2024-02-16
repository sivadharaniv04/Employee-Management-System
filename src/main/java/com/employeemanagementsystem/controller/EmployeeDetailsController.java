package com.employeemanagementsystem.controller;

import com.employeemanagementsystem.entity.EmployeeDetails;
import com.employeemanagementsystem.services.EmployeeDetailsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee/")
public class EmployeeDetailsController {
    @Autowired
    EmployeeDetailsServiceImplementation implementation;

    @GetMapping("viewEmployee")
    public List<EmployeeDetails> viewEmployee(){
        return implementation.viewEmployee();
    }

    @PostMapping("insertEmployee")
    public void insertEmployee(@RequestBody EmployeeDetails details){
        implementation.insertEmployee(details);
    }

    @PutMapping("updateEmployee")
    public void updateEmployee(@RequestBody EmployeeDetails details){
        implementation.updateEmployee(details);
    }

    @DeleteMapping("deleteEmployeeById/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        implementation.deleteEmployeeById(id);
    }

    @GetMapping("findEmployeeById/{id}")
    public Optional<EmployeeDetails> findEmployeeById(@PathVariable int id){
        return implementation.findEmployeeById(id);
    }
}
