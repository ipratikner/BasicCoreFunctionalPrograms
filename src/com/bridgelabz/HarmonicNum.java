package com.bridgelabz;
import java.util.Scanner;

/*
 * Write a program HarmonicNumber.java that takes a command-line argument n
 * and prints the nth harmonic number. Harmonic Number is of the form.
 */
public class HarmonicNum {

    public static void main(String[] args) {
        System.out.println("Enter The Value of N : ");
        Scanner num = new Scanner(System.in);
        double n = num.nextDouble();

        double sum =0.0;
        for (int i=1; i<=n; i++){
            sum = sum + (1.0/i);
            if(i == 1)
                System.out.println("1 + ");
            else
                System.out.println("1/"+ i);
        }
        System.out.println();
        System.out.println("Sum of the series is : "+ sum);

    }
}
