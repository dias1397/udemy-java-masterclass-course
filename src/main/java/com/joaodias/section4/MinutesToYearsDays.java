package com.joaodias.section4;

public class MinutesToYearsDays {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(String.format("%d min = %d y and %d d", minutes, minutes / 525600, (minutes % 525600) / 1440));
        }
    }
}
