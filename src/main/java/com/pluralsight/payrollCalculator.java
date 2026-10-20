package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String Name = scanner.next();

        System.out.print("Hours worked:");
        float hoursWorked = scanner.nextFloat();

        System.out.print("What is your pay rate:");
        float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.println("Hi " + Name + " your gross pay is " + grossPay);



    }


}
