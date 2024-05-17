package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("welcome to employee wage computation");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the employee");
       String ename=sc.next();

        System.out.println("enter the  employee department");
        String department=sc.next();

        System.out.println("enter the  employee phone number");
        String phone=sc.next();

        EmployeeService e=new EmployeeServiceImple();
        boolean isEmployeePresent = e.isEmployeeAvailabale();

        System.out.println(ename+"attedence "+isEmployeePresent);

        Employee e1=new Employee(ename,phone,department,isEmployeePresent);

        System.out.println(e1);


        e.checkWagePerDay();

        e.switchCase();

        e.monthWage();

    }
}