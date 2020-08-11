package com.piyu.exercise;

public class Starpattern1 {
    public static void main(String[] args) {
        int NumberofVerticalLines = 4;
        int NumberOfHorizontalLines = 5;
        for (int i = 1; i <= NumberofVerticalLines; i++) {
            for (int j = 1; j <= NumberOfHorizontalLines; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
