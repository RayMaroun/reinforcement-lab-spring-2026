package com.pluralsight;

import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name = getName(myScanner);
        int age = getAge(myScanner);

        System.out.println("======================================================");
        printNameAndAge(name, age);
        System.out.println("======================================================");
        printVotingEligibility(age);
        System.out.println("======================================================");
        printMessage(name, age);
        System.out.println("======================================================");
        printWelcomeMessage(name);
        System.out.println("======================================================");
        printDrinkingEligibility(name, age);
        System.out.println("======================================================");

        double number = getNumber(myScanner);
        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("======================================================");

    }

    public static double getNumber(Scanner scanner) {
        System.out.println("Enter a number:");
        return scanner.nextDouble();
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You are old enough to drink.");
        } else {
            System.out.println("You are not old enough to drink.");
        }
    }

    /*public static void printWelcomeMessage(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome, Alice!");
        } else {
            System.out.println("Hello, stranger!");
        }
    }*/

    /*public static void printWelcomeMessage(String name) {
        switch (name.toLowerCase()){
            case "alice":
                System.out.println("Welcome, Alice!");
                break;
            case "bob":
                System.out.println("Hey Bob, do you want to grab a drink?");
                break;
            default:
                System.out.println("Hello, stranger!");
                break;
        }
    }*/

    public static void printWelcomeMessage(String name) {
        switch (name.toLowerCase()) {
            case "alice" -> System.out.println("Welcome, Alice!");
            case "bob" -> System.out.println("Hey Bob, do you want to grab a drink?");
            default -> System.out.println("Hello, stranger!");
        }
    }

    public static void printVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter your age:");
        return scanner.nextInt();
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name:");
        return scanner.nextLine();
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
