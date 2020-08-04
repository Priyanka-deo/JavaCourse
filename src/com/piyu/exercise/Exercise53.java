package com.piyu.exercise;

public class Exercise53 {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Inside loop Before continue");
                continue;
                //System.out.println("Inside loop After continue");
            }
        }
        System.out.println("After loop");
    }
}
