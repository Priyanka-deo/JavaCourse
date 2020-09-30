package com.piyu.exercise.PracticeProgram;

public class Employee {
    int eno = 111;
    String ename = "AAA";
    String eemailid = "durga@durgasoft.com";
    String eaddr = "Nagpur";
    String emobile = "91-7709469173";

    public void getEmpDetails() {
        System.out.println("Employee Details");
        System.out.println("------------------");
        System.out.println("Employee Number    :" + eno);
        System.out.println("Employee Name      :" + ename);
        System.out.println("Employe Emailid    :" + eemailid);
        System.out.println("Employee Address   :" + eaddr);
        System.out.println("Employee Mobile    :" + emobile);
    }
}
    class Test
    {
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.getEmpDetails();
        }
    }

