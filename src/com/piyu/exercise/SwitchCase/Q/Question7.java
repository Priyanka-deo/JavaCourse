package com.piyu.exercise.SwitchCase.Q;

public class Question7 {
    public static void main(String[] args) {
        int number = 5;
        switch (number)
        {
            //case 2:
            //case 4:
            case 6:
            case 8:
                System.out.println("Even");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd");
                break;
            case 2:
            //case 3:
            //case 5:
            //case 7:
                System.out.println("Prime");
                break;
            case 4:
            //case 9:
                System.out.println("Perfect Square");
                break;
            default:
                System.out.println("Can only describe numbers frm 1 to 9");


        }
    }
}
