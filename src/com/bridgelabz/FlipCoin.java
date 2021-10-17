package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;
/*
 1. Flip Coin and print percentage of Heads and Tails
     a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
     b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
         heads
     c. O/P -> Percentage of Head vs Tails
 */
    public class FlipCoin {

        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            Random random = new Random();
            System.out.print(" Enter The number of Times to Flip Coin : ");
            int n = num.nextInt();

            int head=0, tail=0;

            for (int i=1; i<=n; i++){
                int r = random.nextInt(2);
                if(r==1){
                    tail++;
                    System.out.println("Tail comes");
                }
                else{
                    head++;
                    System.out.println("Head comes");
                }
            }
            float headPercent, tailsPercent;

            headPercent = (float) head/n * 100;
            tailsPercent = (float) tail/n * 100;
            System.out.println("-----Percentage of Head vs Tails-----");
            System.out.println("Percentage of Head : "+ headPercent);
            System.out.println("Percentage of Tails : "+ tailsPercent);


        }
    }