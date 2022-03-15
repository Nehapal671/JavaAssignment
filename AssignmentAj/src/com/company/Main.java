package com.company;
interface car{
    void apply_break(int decrement);
    void Acceleration(int increment);
}
class swift_dzire implements car{
    int speed=10;
    @Override
    public void apply_break(int decrement) {
         speed= speed - decrement;
        System.out.println(speed);
    }
    @Override
    public void Acceleration(int increment) {
        speed = speed + increment;
        System.out.println(speed);
    }
}
public class Main {
    public static void main(String[] args) {
        swift_dzire s1= new swift_dzire();
        s1.apply_break(3);
        s1.Acceleration(5);
    }
}
