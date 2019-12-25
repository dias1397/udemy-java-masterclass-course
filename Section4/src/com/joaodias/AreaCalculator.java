package com.joaodias;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(getArea(5.0));
        System.out.println(getArea(-1));
        System.out.println(getArea(5.0, 4.0));
        System.out.println(getArea(-1.0, 4.0));
    }

    public static double getArea(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return Math.PI * Math.pow(radius, 2);
    }

    public static double getArea(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}
