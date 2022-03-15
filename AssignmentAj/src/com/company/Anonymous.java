package com.company;
interface area{
    int length=10;
    int width=20;
    void getsquare();
}

public class Anonymous {
    public static void main(String[] args) {
        perimeter pt = new perimeter();
        pt.getsquare();
    }
}
class perimeter implements area{
    @Override
    public void getsquare() {
        System.out.println(length*width);
    }
}



