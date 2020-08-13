package com.piyu.exercise.SwitchCase.Q;

public class Question6 {
    public static void main(String[] s) {
        int number = 3;
        if(number == 1)
        {
            System.out.println("One");
        }
        if(number == 2)
        {
            System.out.println("Two");
        }
        if(number == 3)
        {
            System.out.println("Three");
        }
    }
}
class PrintNumbers2{
    public static void main(String[] args) {
        int number = 3;
        switch (number)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break; case 3:
            System.out.println("Three");
            break;

        }
    }
}
