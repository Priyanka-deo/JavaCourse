package com.piyu.exercise;

public class Classattendence {
    public static void main(String[] args) {
        int NumberOfClassesHeld = 40;
        int NumberOfClassesAttended = 28;
        int Attendence = ((NumberOfClassesAttended / NumberOfClassesHeld) * 100);
        if (Attendence >= 75) {
            System.out.println(" You have 75% Attendence you can give exam ");
        } else {
            System.out.println("You do not have 75% Attendence you can not give exam ");
        }
    }
}
