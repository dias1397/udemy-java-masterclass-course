package com.joaodias.section11.test;

import com.joaodias.section11.series.Series;

public class Main {

    public static void main(String[] args){
        for (int i = 0; i<=10; i++){
            System.out.print(Series.nSum(i) + " ");
        }

        System.out.println();

        for (int i = 0; i<=10; i++){
            System.out.print(Series.factorial(i) + " ");
        }

        System.out.println();

        for (int i = 0; i<=10; i++){
            System.out.print(Series.fibonacci(i) + " ");
        }
    }
}
