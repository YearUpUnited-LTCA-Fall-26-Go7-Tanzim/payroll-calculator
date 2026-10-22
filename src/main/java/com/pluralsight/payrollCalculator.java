package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = namePrompt(scanner);
        float hours = hoursPrompt(scanner);
        float rate = ratePrompt(scanner);

        float GrossPay = calculateGrossPay(hours, rate);

        System.out.println("Hi " + name + " your gross pay is: " + GrossPay);





    }

    public static String namePrompt(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        return name;
    }

    public static float hoursPrompt(Scanner scanner) {
        System.out.print("How many hours worked: ");
        float hours = scanner.nextFloat();
        return hours;
    }

    public static float ratePrompt(Scanner scanner) {
        System.out.print("What is your pay rate: ");
        float rate = scanner.nextFloat();
        return rate;
    }

    public static float calculateGrossPay(float hours, float rate) {
        float GrossPay = hours * rate;
        return GrossPay;

    }








}
