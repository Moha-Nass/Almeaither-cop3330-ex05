package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *   Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 5 - Simple Math");
        System.out.print("What is the first number?");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("What is the second number? ");
        int b = in.nextInt();
        int sum = a+b;
        int diff = a-b;
        int multi = a*b;
        int div = a/b;

        System.out.println(a+" + "+ b + " = "+ sum);
        System.out.println(a+" - "+ b + " = "+ diff);
        System.out.println(a+" * "+ b + " = "+ multi);
        System.out.println(a+" / "+ b + " = "+ div);
    }
}
