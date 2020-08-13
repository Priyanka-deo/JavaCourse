package com.piyu.exercise.SwitchCase.Q;

public class Question10 {
    public static void main(String[] args) {
        int variable = 1;
        switch (variable)
        {
            case 1:
                System.out.println("P");
            case 2:
            case 3:
                System.out.println("Q");
                break;
            case 4:
                System.out.println("R");
            default:
                System.out.println("S");
        }
    }
}
