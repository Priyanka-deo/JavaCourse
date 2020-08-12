package com.piyu.exercise;

public class Starpattern4 {
    public static void main(String[] args) {
        int numOfHorizontalLine = 5;
        int numOfVerticalLine = 9;

        for(int i = 1; i <= numOfHorizontalLine; i++)
        {
            for(int j = numOfVerticalLine/2; j >= i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i * 2-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
