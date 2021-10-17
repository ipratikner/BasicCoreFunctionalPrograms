package com.bridgelabz;
import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd

public class EvenOdd {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = num.nextInt();
        if (n%2 == 0)
            System.out.println(n+" Number is Even");
        else
            System.out.println(n+ " Number is Odd");

    }
}
