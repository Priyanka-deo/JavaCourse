package com.piyu.exercise;

public class Starpattern3 {
    public static void main(String[] args) {
       int NumberOfVerticalLines = 5;
       int NumberOfHorizontalLines = 5;
        for (int i = 1; i <= NumberOfHorizontalLines; i++) {
            for (int j = NumberOfVerticalLines - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
