package com.joaodias.section05;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j == i || i == 1 || i == number || j == 1 || j == number || j == number - i + 1) {
                        System.out.print('*');
                    }
                    System.out.print('\t');
                }
                System.out.println();
            }
        }
    }
}
