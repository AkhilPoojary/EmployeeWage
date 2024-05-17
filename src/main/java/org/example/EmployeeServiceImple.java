package org.example;

import java.util.Random;

import static java.lang.Math.random;

public class EmployeeServiceImple implements EmployeeService{
    @Override
    public boolean isEmployeeAvailabale() {
        Random random=new Random();
        return random.nextBoolean();
    }
}
