package com.joaodias.challenge2and3;

import java.util.function.Function;

public class Challenge2and3 {

    public static void main(String[] args) {
        // Challenge 2
        Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };

        // Challenge 3
        System.out.println(lambdaFunction.apply("1234567890"));
    }
}
