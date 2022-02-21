package com;

public class EmployeeWage {
    int dailyWage;
    int fullDayHour = 8;
    int wagePerHour = 20;

    boolean isPresent(){
        int isPresent = (int) Math.floor((Math.random() * 10) % 2);
        if(isPresent == 1) {
            System.out.println("Employee Present.");
            return true;
        }
        System.out.println("Employee Absent.");
        return false;
    }

    int dailyWage(){
        dailyWage = 0;
        if (isPresent()) {
            dailyWage = wagePerHour * fullDayHour;
        }
        return dailyWage;
    }

}
