package com.piyu.exercise;

public class Exercise54 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    continue;
                }
                System.out.println(i + "  " + j);
            }
        }
    }
}
