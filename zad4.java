package org.example;
import java.util.Scanner;
public class zad4 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter the last number: ");
    int lastNumber = scanner.nextInt();
    System.out.println("Numbers between " + firstNumber + " and " + lastNumber + ":");

    int currentNumber = firstNumber + 1;
    while (currentNumber < lastNumber) {
        System.out.println(currentNumber);
        currentNumber++;
    }

    scanner.close();
}
}
