package com.bridgelabz;
import java.util.Scanner;

//Java Program to Compute Quotient and Remainder

public class CalQuotientRemainder {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter dividend: ");
        int dividend = num.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = num.nextInt();

        System.out.println("Quotient is : "+ dividend / divisor);
        System.out.println("Remainder is : "+ dividend % divisor);

    }
}
