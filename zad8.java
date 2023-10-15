package org.example;

public class zad8 {
    public static void main(String[] args) {
        drawStarsPyramid(5);
        drawStarsPyramid(10);
        drawInvertedStarsPyramid(5);
        drawInvertedStarsPyramid(10);
    }
    public static void drawStarsPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawInvertedStarsPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
}
    }
}
