package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double getPrice(String membership, int age) {
        double price = 0.00;

        switch (membership) {
            case "regular":
                if (age < 18) {
                    price = 50.00;
                } else if (age <= 64) {
                    price = 100.00;
                } else {
                    price = 75.00;
                }
                break;
            case "vip":
                if (age < 18) {
                    price = 75.00;
                } else if (age <= 64) {
                    price = 150.00;
                } else {
                    price = 112.50;
                }
                break;
            case "premium":
                if (age < 18) {
                    price = 100.00;
                } else if (age <= 64) {
                    price = 200.00;
                } else {
                    price = 150.00;
                }
                break;
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membership = userInput.nextLine().toLowerCase();

        System.out.print("Enter age: ");
        int age = userInput.nextInt();

        if (!membership.equals("regular") && !membership.equals("vip") && !membership.equals("premium")) {
            System.out.print("Invalid membership status entered.");
        } else {
            System.out.printf("Price: $%,.2f", getPrice(membership, age));
        }
    }
}