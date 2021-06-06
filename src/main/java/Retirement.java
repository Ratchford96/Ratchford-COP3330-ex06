/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Ratchford
 */

import java.util.Scanner;
public class Retirement {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Declare variables
        int age;
        int currentAge;
        int time;
        int retire;

        // Tells our program for user to enter data

        System.out.print(" Enter your current age. ");
        currentAge = scan.nextInt();

        System.out.print(" Enter the age you want to retire. ");
        age = scan.nextInt();
        // formula to solve how many years left before retirement.
        retire = age - currentAge;

        // prints our data

        System.out.println("What is your current age? " + currentAge);

        System.out.println(" At what age would you like to retire? " + age);

        System.out.println(" you have " + retire + " years left until you can retire ");






    }
}
