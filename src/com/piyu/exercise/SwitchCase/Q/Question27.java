package com.piyu.exercise.SwitchCase.Q;
class Employee{
    public static void main(String[] args) {
        String eid = "E - 111";
        String ename = "Durga";
        float esal = 25000.0f;
        String eaddr = "Hyderabad";
        String eemailid ="durga@durgasoft.com";
        String emobile = "91-9988776655";

       //public void display_Emp_Details();
        {
            System.out.println("Employee Details");
            System.out.println("-----------");
            System.out.println("Employee id   :+eid");
            System.out.println("Employee Name  :+ename");
            System.out.println("Employee Salary :+esal");
            System.out.println("Employee Address :+addr");
            System.out.println("Employee Email :+eemail");
            System.out.println("Employee Mobile:+emobile");
        }

        }
        class Test{
            public void main(String[] args) {
                Employee emp = new Employee();
               // emp.display_Emp_Details();
            }
        }

        
    }
}
