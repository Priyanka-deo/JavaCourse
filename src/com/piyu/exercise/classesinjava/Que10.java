package com.piyu.exercise.classesinjava;

public class Que10 {
    public static void main(String[] args) {
        System.out.println("Before Loop");
        for (int i = 0; i <= 0 || i >= 0; i++) {
            System.out.println("Inside Loop");
            break;
        }
        System.out.println("After Loop");
    }
}
