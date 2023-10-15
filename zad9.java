package org.example;

public class zad9 {
    public static void main(String[] args) {
        drawNumbersPyramid(5);
        drawNumbersPyramid(10);
    }
    public static void drawNumbersPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

