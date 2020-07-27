package com.piyu.exercise;

public class Exercise13 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println((--a + --a) * (++a - a--) + (--a + a--) * (++a + a++));
    }
}
