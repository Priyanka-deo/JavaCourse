package com.piyu.exercise;

public class Starpattern1 {
    public static void main(String[] args) {
        int numberofVerticalLines = 4;
        int numberOfHorizontalLines = 8;
        for (int i = 1; i <= numberofVerticalLines; i++) {
            for (int j = 1; j <= numberOfHorizontalLines; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
