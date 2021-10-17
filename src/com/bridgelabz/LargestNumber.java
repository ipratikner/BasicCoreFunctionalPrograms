package com.bridgelabz;
import java.util.Scanner;

//Java Program to Find the Largest Among Three Numbers

public class LargestNumber {

    public static void main(String[] args)
        {
            int a, b, c, largest, temp;

            Scanner sc = new Scanner(System.in);
            //reading input from the user

            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
            System.out.println("Enter the third number:");
            c = sc.nextInt();

            //comparing a and b and storing the largest number in a temp variable
            temp=a>b?a:b;

            //comparing the temp variable with c and storing the result in the largest variable
            largest=c>temp?c:temp;

            //prints the largest number
            System.out.println("The largest number is: "+largest);
        }
    }
