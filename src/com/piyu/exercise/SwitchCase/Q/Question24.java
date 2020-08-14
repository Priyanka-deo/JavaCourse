package com.piyu.exercise.SwitchCase.Q;

public class Question24 {
    public static void main(String[] args) {
        int numberOfVerticalLines = 5;
        int numberOfHorizontalLines = 5;
        int starCount = 5;
        for (int i = 1; i <= numberOfHorizontalLines; i++) {
            System.out.println();
            for (int j = 1; j <= starCount; j++)
            {
                System.out.print("*");
            }
           starCount--;
        }
    }
}