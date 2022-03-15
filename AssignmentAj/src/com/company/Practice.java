package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the first number");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("Enter the second number ");
        Scanner sc1=new Scanner(System.in);
        int y= sc1.nextInt();
        n=x+y;
        System.out.println("The sum of"+ x +" "+"and"+ y +" "+"is " + n);
    }
}
