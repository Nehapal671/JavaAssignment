package com.company;
class parent{
    public void parent1() {
        System.out.println("have a chocolate and sleep well");
    }
}
class child1 extends parent{
    public void child()
    {
        System.out.println("Thank_you");
    }
}
class child2 extends child1 {
    public void son(){
        System.out.println("Can i sleep mummy");
    }
}
class child3 extends parent{
    public void mum(){
        System.out.println("Yes dear son!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        child3 c2 = new child3();
        child2 c1 = new child2();
        c2.parent1();
        c1.child();
        c1.son();
        c2.mum();
    }

}
