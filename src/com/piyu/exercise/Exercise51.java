package com.piyu.exercise;

public class Exercise51 {
    public static void main(String[] args) {
        l1:
        for (int i = 0; i < 10; i++)  //outer loop
        {
            for (int j = 0; j < 10; j++) //nested loop
            {
                if (j == 5) {
                    break l1;
                }
                System.out.println(i + "  " + j);
            }
        }// out side of nested loop
    }

}
