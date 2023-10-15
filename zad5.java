package org.example;
import java.util.Scanner;
public class zad5 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt();
    double sum = 0;
    for (int i = 0; i <= n; i++) {
        sum += Math.pow(2, i);
    }
    int result = (int) sum; // Convert the sum to an integer
    System.out.println("The sum of 2^0 + 2^1 + 2^2 + ... + 2^n is: " + result);
    scanner.close();
}
}
