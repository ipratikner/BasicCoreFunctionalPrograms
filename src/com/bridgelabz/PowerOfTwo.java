package com.bridgelabz;
import java.util.Scanner;

/*       Power of 2
         a. Desc -> This program takes a command-line argument N and prints a table of the
                     powers of 2 that are less than or equal to 2^N.
         b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
         c. Logic -> repeat until i equals N.

*/
    public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        int n,i=1;

        System.out.println("Enter value for n : ");
        n = cs.nextInt();

        System.out.println("power of 2^"+n+" is: "+(Math.pow(2,n)));
        System.out.println();
        System.out.println("Printing all till Power Value "+n);

        while (i<=n){//
            System.out.println("Power of 2^"+i+" is: "+(Math.pow(2,i)));
            i = i + 1;
        }
    }
}
