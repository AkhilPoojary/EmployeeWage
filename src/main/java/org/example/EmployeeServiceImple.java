package org.example;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class EmployeeServiceImple implements EmployeeService {
    @Override
    public boolean isEmployeeAvailabale() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public int checkWagePerDay() {
        if (isEmployeeAvailabale()) {
            int wagePerHour = 20;
            Scanner sc = new Scanner(System.in);
            System.out.println("employee is part time or full time employee");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("employee is full time worker");
                System.out.println("daily employee wage is " + 20 * 8);
                return 20 * 8;
            } else if (choice == 2) {
                System.out.println("employee is part time worker");
                System.out.println("daily employee wage is " + 20 * 4);
                return 20 * 4;
            }
        } else {
            System.out.println("employee is absent ");
        }
        return 0;
    }
}
