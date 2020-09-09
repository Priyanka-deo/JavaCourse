package com.piyu.exercise.ObjectOrientedProgramming;
    class A{
    }
    class Test{
        public static void main(String[] args) {
        A a = new A();
        int hashCode = a.hashCode();
            System.out.println("Object HashCode :" +hashCode);
            String ref = a.toString();
            System.out.println("Object Reference :" +ref);
        }
    }


