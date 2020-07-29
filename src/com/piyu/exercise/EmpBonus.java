package com.piyu.exercise;

public class EmpBonus {
    public static void main(String[] args) {
        double salary = 8999.99;
        double yearsOfService = 5.5;
        double bonus = (salary * yearsOfService);
        if (yearsOfService > 5) {
            System.out.println("your year Of Service is more than 5 will get " + bonus);
        } else if (yearsOfService > 10) {
            System.out.println("your year Of Service is more than 10 will get " + bonus);
        }
    }
}
