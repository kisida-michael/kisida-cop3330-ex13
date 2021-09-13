package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class CompoundInterest
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is the principal amount? ");
        int p = input.nextInt();  // Read user input
        System.out.print("What is the rate? ");
        double interestRate = input.nextDouble();  // Read user input
        double r = interestRate /  100;
        System.out.print("What is the number of years? ");
        int t = input.nextInt();  // Read user input
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();  // Read user input
        double interest = p * Math.pow(1 + (r / n), n * t);
        double round = Math.round(interest * 100.0) /100.0;

        String output1 = String.format("$%d invested at %.1f%% for %d compounded %d per year is $%.2f.", p, interestRate, n, t, round);
        System.out.println(output1);
        input.close();
    }
}
