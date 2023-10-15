package org.example;
import java.util.Scanner;
public class zad6 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many times should the text be printed? ");
    int numberOfTimes = scanner.nextInt();

    for (int i = 0; i < numberOfTimes; i++) {
        printText();
    }

    scanner.close();
}

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe, and Java.");
    }
}
