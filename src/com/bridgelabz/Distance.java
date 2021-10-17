package com.bridgelabz;
import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double distance=0;
        distance = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
        System.out.println("Distance : " + distance);
    }
}
