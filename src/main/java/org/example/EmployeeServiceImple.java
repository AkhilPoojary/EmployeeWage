package org.example;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class EmployeeServiceImple implements EmployeeService {

    private static final int absent = 0;
    private static final int isFullTime = 1;
    private static final int isPartTime = 2;
    private static final int wagePerHour = 20;
    private static final int totalHourPerDay = 8;
    private static final int  part_Time  = 4;

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

    @Override
    public void switchCase() {
        Random random =new Random();
        int choice = random.nextInt(3);

        switch (choice)
        {
            case isFullTime:
                System.out.println("employee is full time worker");
                System.out.println("daily employee wage is " + 20 * 8);
            break;
            case isPartTime:
                System.out.println("employee is part time worker");
                System.out.println("daily employee wage is " + 20 * 4);
                break;
            case absent:
                System.out.println("employee is absent");
                System.out.println("daily employee wage is 0" );
                break;
        }
    }

    @Override
    public int monthWage() {
        if (isEmployeeAvailabale()) {
            int wagePerHour = 20;
            Scanner sc = new Scanner(System.in);
            System.out.println("employee is part time or full time employee");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("employee is full time worker");
                System.out.println("daily employee wage is " + 20 * 8);
                System.out.println("monthly employee wage is " + 20 * 8 * 20);
                return 20 * 8 * 20;
            } else if (choice == 2) {
                System.out.println("employee is part time worker");
                System.out.println("daily employee wage is " + 20 * 4 *20);
                return 20 * 4 * 20;
            }
        } else {
            System.out.println("employee is absent ");
        }
        return 0;
    }
}
