package com;


public class EmployeeWage {
    int dailyWage;
    int fullDayHour = 8;
    int partTimeHour = 4;
    int wagePerHour = 20;

    int isPresent(){
        int isPresent = (int) Math.floor((Math.random() * 10) % 3);
        if(isPresent == 1) {
            System.out.println("Employee Present and Full time.");
            return 1;
        } else if (isPresent == 2){
            System.out.println("Employee Present and Part time.");
            return 2;
        }
        System.out.println("Employee Absent.");
        return 0;
    }

    int dailyWage(){
        dailyWage = 0;
        int isPresent = isPresent();
        if (isPresent == 1) {
            dailyWage = wagePerHour * fullDayHour;
        } else if (isPresent == 2) {
            dailyWage = wagePerHour * partTimeHour;
        }
        return dailyWage;
    }

}
