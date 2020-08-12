package com.piyu.exercise;

public class Starpattern3 {
    public static void main(String[] args) {
       int numberOfVerticalLines = 5;
       int numberOfHorizontalLines = 5;
        for (int i = 1; i <= numberOfHorizontalLines; i++) {
            for (int j = numberOfVerticalLines - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
