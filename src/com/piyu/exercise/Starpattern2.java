package com.piyu.exercise;

public class Starpattern2 {
    public static void main(String[] args) {
        int numberOfHorizontalLines = 5;
        for (int i = 1; i <= numberOfHorizontalLines; i++) {
            for (int j = 1; j<=i * 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}