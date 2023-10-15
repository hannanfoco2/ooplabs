package org.example;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = reader.nextInt();
            sum += number;
        }

        System.out.println("Sum: " + sum);

        // Close the scanner
        reader.close();
    }
}

