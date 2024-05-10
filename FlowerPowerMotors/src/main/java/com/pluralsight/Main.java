package com.pluralsight;

// imports
import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static String userName;

    public static void main(String[] args)
    {
        // prompt the user for their first name for a more personalized experience
        System.out.println();
        System.out.println("Enter your first name: ");
        userName = userInput.nextLine().trim().toUpperCase();
        System.out.println();

        // greet the user
        System.out.println("              Hi, " + userName);
        System.out.println("Welcome to \uD83C\uDF38 Flower Power Motors! \uD83D\uDE99\uD83D\uDCA8");
        System.out.println("Where we specialize exclusively in Volkswagen Beetle Inventory ✨ ");
    }
}