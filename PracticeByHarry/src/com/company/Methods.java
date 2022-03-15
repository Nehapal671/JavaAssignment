package com.company;
class cellphone{
    public static void ring(){
        System.out.println("Ringing");
    }
    public static  void ring1()
        {
        System.out.println("Vibrating");
    }
}
public class Methods {
    public static void main(String[] args) {
        cellphone c= new cellphone();
        c.ring();
        c.ring1();

    }
}
