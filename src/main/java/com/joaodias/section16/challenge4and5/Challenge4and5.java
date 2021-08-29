package com.joaodias.section16.challenge4and5;

import java.util.function.Function;

public class Challenge4and5 {

    public static void main(String[] args) {
        Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        // Challenge 5
        System.out.println(Challenge4and5.everySecondCharacter(lambdaFunction, "1234567890"));
    }

    private static String everySecondCharacter(Function<String, String> function, String functionArg) {
        return function.apply(functionArg);
    }
}
