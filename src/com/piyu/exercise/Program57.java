package com.piyu.exercise;

public class Program57 {
    public static class Numericpattern1{
        public static void main(String[] args) {
            int numOfVerticalLines = 9;
            int numOfHorizontalLines = 5;
            for(int i = 1; i <= numOfHorizontalLines; i++)
            {
                for(int j = numOfVerticalLines/2; j >= i; j--)
                {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i * 2 - 1; k++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
