package com.piyu.exercise;

public class PrimeNo {
    public static void main(String[] args) {
        int no = 7;
        int temp = 0;
        boolean flag = false;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) ;
            {
               flag = true;
               break;
            }
        }
        if (flag) {
            System.out.println(no + " is  prime number ");
        } else {
            System.out.println(no + " is not prime number ");
        }
    }
}
