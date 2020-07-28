package com.piyu.exercise;

public class Numberofdigits {
    public static void main(String[] args) {
        int no = 5000;
        if (no < 10) {
            System.out.println(" It is one digit number ");
        } else if (no >= 10 && no < 100) {
            System.out.println(" It is two digit number ");
        } else if (no >= 100 && no < 1000) {
            System.out.println(" It is four digit number ");
        } else if (no >= 1000 && no < 10000) {
            System.out.println(" It is four digit number ");
        } else {
            System.out.println("The number has more than four digits");
        }

    }
}


