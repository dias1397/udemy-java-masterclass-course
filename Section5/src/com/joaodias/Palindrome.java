package com.joaodias;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int reverse = 0;
        int original = number;

        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;

            number /= 10;
        }

        return original == reverse;
    }

}
