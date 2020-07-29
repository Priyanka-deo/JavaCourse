package com.piyu.exercise;

public class EmpBonus {
    public static void main(String[] args) {
        float yearsOfService = 5.5f;
        double salary = 8999.99;
        double bonus = (salary * 5) / 100;
        if (yearsOfService >= 5 && yearsOfService < 10) {
            System.out.println("your year Of Service is more than 5 will get " + bonus);
        } else if (yearsOfService >= 10) {
            System.out.println("your year Of Service is more than 10 will get " + bonus);
        } else {
            System.out.println(" No bonus ");
        }
    }
}
