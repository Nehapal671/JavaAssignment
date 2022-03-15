package com.company;
abstract class foodie{
    public abstract void not_sharing();
    {
        System.out.println("I am Foodie");
    }
    public abstract void not();
}
class abstract_class extends foodie{
    public static void main(String[] args) {
        abstract_class a = new abstract_class();
        a.not();
        a.not_sharing();
    }
    @Override
    public void not_sharing() {
        System.out.println("I am not going to share it");
    }
    @Override
    public void not() {
        System.out.println("I have some sweets and chocolate");
    }
}
