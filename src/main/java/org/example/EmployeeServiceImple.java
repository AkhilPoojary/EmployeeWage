package org.example;

import java.util.Random;

import static java.lang.Math.random;

public class EmployeeServiceImple implements EmployeeService{
    @Override
    public boolean isEmployeeAvailabale() {
        Random random=new Random();
        return random.nextBoolean();
    }

    @Override
    public int checkWagePerDay() {
        if(isEmployeeAvailabale()) {
            int wagePerHour = 20;
            System.out.println("daily employee wage is " + 20 * 8);
            return 20 * 8;
        }
        else {
            System.out.println("employee is absent ");
            return 0;
        }
    }
}
