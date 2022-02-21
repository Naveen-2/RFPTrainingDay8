package com;

public class EmployeeWage {
    void isPresent(){
        int isPresent = (int) Math.floor(Math.random() % 2);
        if(isPresent == 1)
            System.out.println("Employee Present.");
        else if (isPresent == 0)
            System.out.println("Employee Absent.");
    }
}
