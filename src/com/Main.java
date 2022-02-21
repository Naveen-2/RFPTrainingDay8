package com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        EmployeeWage employee = new EmployeeWage();
        employee.calculateMonthlyWage();

        System.out.println("Monthly wage for the employee is Rs. " + employee.monthlyWage);
    }
}
