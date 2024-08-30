package org.example;

//Write a test for a method that calculates the sum of two integers.
//
//Write a test for a method that checks if a given number is even.
//
//Write a test for a method that calculates the product of two integers.
//
//Write a test for a method that converts a given string to uppercase.
//
//Write a test for a method that checks if a given number is positive.
public class Main {
    public static void main(String[] args) {

    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int product(int number, int number2) {
        return number * number2;
    }

    public static String upperCase(String string) {
        return string.toUpperCase();
    }

    public static boolean numberIsPositive(int number)  {
        return number > 0;
    }
}