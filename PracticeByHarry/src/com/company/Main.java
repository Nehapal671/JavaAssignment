package com.company;
 class custom{
     int age;
     String name;
     float salary;
     public  void getname(){
         System.out.println(name);
         System.out.println(age);

     }
     public void getsalary(){
         System.out.println(salary);
     }

}
public class Main {
    public static void main(String[] args) {

        custom c= new custom();
        c.age=10;
        c.name="neha";
        c.getname();
        c.getsalary();

    }
}
