package com.joaodias;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int a = first >= second ? first : second;
        int b = second <= first ? second : first;
        int remainder;

        while (b > 0) {
            remainder = a % b;

            a = b;
            b = remainder;
        }

        return a;
    }
}
