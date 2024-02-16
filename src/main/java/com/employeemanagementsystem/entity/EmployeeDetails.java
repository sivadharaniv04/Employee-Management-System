package com.employeemanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeNumber;
    private String employeeName;
    private String employeeAddressLine1;
    private String employeeAddressLine2;
    private String employeeCity;
    private int employeeZipCode;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddressLine1() {
        return employeeAddressLine1;
    }

    public void setEmployeeAddressLine1(String employeeAddressLine1) {
        this.employeeAddressLine1 = employeeAddressLine1;
    }

    public String getEmployeeAddressLine2() {
        return employeeAddressLine2;
    }

    public void setEmployeeAddressLine2(String employeeAddressLine2) {
        this.employeeAddressLine2 = employeeAddressLine2;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public int getEmployeeZipCode() {
        return employeeZipCode;
    }

    public void setEmployeeZipCode(int employeeZipCode) {
        this.employeeZipCode = employeeZipCode;
    }
}
