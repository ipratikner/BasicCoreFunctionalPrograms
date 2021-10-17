package com.bridgelabz;
import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner chr = new Scanner(System.in);
        System.out.println("Enter a Alphabet : ");
        char c = chr.next().charAt(0);
        System.out.println(c);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                System.out.println("The given Char  " + c + " is Vowel");
            else
                System.out.println("The given Char " + c + " is Consonant");
        } else {
            System.out.println("You entered wrong character");
        }
    }
}
