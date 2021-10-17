package com.bridgelabz;
import java.util.Scanner;

/*      Leap Year
        a. I/P -> Year, ensure it is a 4 digit number.
        b. Logic -> Determine if it is a Leap Year.
        c. O/P -> Print the year is a Leap Year or not.
 */
public class LeapYear {

    public static void main(String[] args) {

        System.out.print("Enter a year 4 digits must : ");
        Scanner num = new Scanner(System.in);
        int year = num.nextInt();

        /* leap year is when:
          1. It is evenly divisible by 100
          2. If it is divisible by 100, then it should also be divisible by 400
          3. Except this, all other years evenly divisible by 4 are leap years.
         */

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
