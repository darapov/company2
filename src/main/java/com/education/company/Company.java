package com.education.company;

import lombok.Data;

import java.util.Arrays;

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


    public long calculateSalaryExpenses(){
        long expenses = 0;

        for (Employee employee : employees) {
            expenses += employee.getSalary();
        }

        return expenses;
    }
    public long medianSalary(){
        return calculateSalaryExpenses()/employees.length;
    }


    public void addEmployeeToCompany (Employee employee) {
        if (employee.getSalary() < 200) {
            System.out.println("Salary is too low!!");
        }

        employees = Arrays.copyOf(employees, employees.length+1);
        employees[employees.length-1] = employee;
    }

    public void fireEmployee(String name) {

        Employee[] employeeArrNew = new Employee[employees.length-1];
        int i =0;
        for (Employee elem: employees) {

            if (elem.getName() != name) {
                employeeArrNew[i] = elem;
                i++;
            }
        }
        employees = Arrays.copyOf(employeeArrNew, employees.length-1);


    }


}
