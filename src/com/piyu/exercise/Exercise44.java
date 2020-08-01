package com.piyu.exercise;

public class Exercise44 {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; i <= 10 || i >= 0; i++) {
            System.out.println("Inside loop");
        }
            System.out.println("After loop");
    }

}
