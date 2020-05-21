package com.joaodias.challenge1;

public class Challenge1 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        runnable.run();
    }
}
