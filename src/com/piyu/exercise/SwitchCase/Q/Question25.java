package com.piyu.exercise.SwitchCase.Q;

public class Question25 {
    public static void main(String[] args) {
        int numberOfVerticalLines = 5;
        int numberOfHorizontalLines = 5;
        for (int i = 1; i <= numberOfHorizontalLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}