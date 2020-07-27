package com.piyu.exercise;

public class Exercise10 {

    public static void main(String[] args) {
        float initialAmountBorrowed = 5000;
        float rateOfInterest = 10;
        float numberOfYears = 5;
        float totalAmountOwed = initialAmountBorrowed * (1 + rateOfInterest * numberOfYears);
        System.out.println(" Priyanka has to payback " + totalAmountOwed + " rs in " + numberOfYears + " years ");
    }
}
