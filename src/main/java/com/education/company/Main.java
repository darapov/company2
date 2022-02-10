package com.education.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Employee dima =  addEmployee("Dimchik", "0954302223", 5000);
        Employee alex = addEmployee("Alesha", "0634302249", 367);
        Employee grisha = addEmployee("Grigoriy", "0634302257", 367000);

        Employee[] employArr = new Employee[] {dima, alex, grisha};


       // Employee[] employArr = new Employee[10];

        Company global = new Company("Globallogic", "Kyiv", "08009999", employArr );

        System.out.println("Choose an option"  + "\n1 - find highest salary employee" +"\n2 - calculate salary expenses"
                  + "\n3 - calculate median salary" + "\n4 - add employee");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
        int inputParameter = Integer.parseInt(br.readLine());
        switch (inputParameter) {
            case 1: System.out.println(global.findHighestSalaryEmployee());
            case 2: System.out.println(global.calculateSalaryExpenses());
            case 3: System.out.println(global.medianSalary());
            case 4: var emp = addEmployee();
                System.out.println(emp);

        }

 */




        Employee serg = addEmployee("Sergay", "0234234", 3000000);
        global.addEmployeeToCompany( serg);

        System.out.println(global.findHighestSalaryEmployee());
        System.out.println(global.calculateSalaryExpenses());
        System.out.println(global.medianSalary());

        global.fireEmployee("Alesha");

        System.out.println(global.findHighestSalaryEmployee());
        System.out.println(global.calculateSalaryExpenses());
        System.out.println(global.medianSalary());



    }



    public static Employee addEmployee (String name, String phone, long salary ) throws IOException {

        return new Employee(name, phone, salary);
    }



}
