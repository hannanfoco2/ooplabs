package org.example;

public class zad7 {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
