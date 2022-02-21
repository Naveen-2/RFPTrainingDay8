package com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        EmployeeWage employee = new EmployeeWage();
        System.out.println("Salary for the day is Rs. " + employee.dailyWage());
    }
}
