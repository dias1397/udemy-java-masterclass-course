package com.joaodias.section16.challenge9;

import java.util.Arrays;
import java.util.List;

public class Challenge9 {

    public static void main(String[] args){
        List<String> topNames = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava",
                                            "oliver", "Jack", "Charlie", "harry", "Jacob");
        // Challenge 9 to 11
        topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase().concat(name.substring(1)))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println("===========================");

        // Challenge 12
        System.out.println(topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase().concat(name.substring(1)))
                .filter(name -> name.charAt(0) == 'A')
                .count() + " name start with letter A");

        System.out.println("===========================");

        // Challenge 14
        topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase().concat(name.substring(1)))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();
    }

}
