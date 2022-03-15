package com.company;
class phone{
    phone(){
        System.out.println("constructor of base class");
    }
    phone(int a){
        System.out.println("overloaded constructor of base class"+ a);
    }

}
class derived extends phone{
    derived(){
        System.out.println("constructor of derived class");
    }
    derived(int a , int b){
        super(a);
        System.out.println("overloaded constructor of derived class:"+ b);
    }
}

public class modifiers {
    public static void main(String[] args) {
       derived d= new derived(4,19);





    }
}

