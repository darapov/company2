package com.education.company;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Employee dima =  new Employee("Dimchik", "0954302223", 5000);
        Employee alex = new  Employee("Alesha", "0634302249", 367);
        Employee grisha = new  Employee("Grigoriy", "0634302257", 367000);



       // Employee dima = Employee.addEmployee("Dimchik", "0954302223", 5000);
        Employee.addEmployee("Alesha", "0634302249", 367);
        Employee.addEmployee("Grigoriy", "0634302257", 367000);

        Company global = new Company("Globallogic", "Kyiv", "08009999", new Employee[] {dima, alex, grisha});

        System.out.println(global.findHighestSalaryEmployee());
    }
}
