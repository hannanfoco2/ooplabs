package org.example;
import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        int numberToGuess = drawNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number (0-100): ");
        int userGuess = scanner.nextInt();
        if (userGuess < numberToGuess) {
            System.out.println("The number is greater.");
        } else if (userGuess > numberToGuess) {
            System.out.println("The number is lesser.");
        } else {
            System.out.println("Congratulations, your guess is correct!");
        }
        scanner.close();
    }
    public static int drawNumber() {
        return (int) (Math.random() * 101);
    }
}
