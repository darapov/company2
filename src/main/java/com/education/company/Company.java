package com.education.company;

import lombok.Data;

@Data
public class Company {
    private String name;
    private String address;
    private String  phone;
    private Employee[] employees;


    public Company(String name, String address, String phone, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
    }


    public String findHighestSalaryEmployee(){
        Employee maxSalaryEmployee = employees[0];

        for (Employee employee : employees) {
           if(employee.getSalary() > maxSalaryEmployee.getSalary()) {
               maxSalaryEmployee = employee;
           }
        }

        return maxSalaryEmployee.getName();
    }


}
