package com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Employee Wage Computation Program.");

        EmployeeWage employee = new EmployeeWage();
        System.out.println("Employee salary for today is Rs. " + employee.dailyWage());
    }
}
