package com.piyu.exercise;

public class Classattendence {
    public static void main(String[] args) {
        int numberOfClassesHeld = 40;
        int numberOfClassesAttended = 28;
        float anttendence = ((numberOfClassesAttended / numberOfClassesHeld) * 100);
        if (anttendence >= 75) {
            System.out.println(" You have 75% attendence you can give exam ");
        } else {
            System.out.println("You do not have 75% attendence you can not give exam ");
        }
    }
}
