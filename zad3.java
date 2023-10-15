package org.example;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers. Enter 0 to calculate the sum.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of the entered numbers: " + sum);

        scanner.close();
    }
}

