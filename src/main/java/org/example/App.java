/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */
/*
Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.
BAC = (A × 5.14 / W × r) − .015 × H
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter a 1 if you are male or a 2 if you are female: " );
        int gen = scnN.nextInt();
        if(gen == 1){
            System.out.print( "How many ounces of alcohol did you have? " );
            int oz = scnN.nextInt();
            System.out.print( "What is your weight, in pounds? " );
            int pnd = scnN.nextInt();
            System.out.print( "How many hours has it been since your last drink? " );
            int hrs = scnN.nextInt();
            double bac = (oz*5.14/pnd*0.73)-0.015*hrs;
            System.out.print( "Your BAC is "+ String.format("%.6f", bac));
            if(bac > 0.08){
                System.out.print( "\nIt is not legal for you to drive.");
            } else if (bac < 0.08) {
                System.out.print( "\nIt is legal for you to drive.");
            }
        }
        if(gen == 2){
            System.out.print( "How many ounces of alcohol did you have? " );
            int oz = scnN.nextInt();
            System.out.print( "What is your weight, in pounds? " );
            int pnd = scnN.nextInt();
            System.out.print( "How many hours has it been since your last drink? " );
            int hrs = scnN.nextInt();
            double bac = (oz*5.14/pnd*0.66)-0.015*hrs;
            System.out.print( "Your BAC is "+ String.format("%.6f", bac));
            if(bac > 0.08){
                System.out.print( "\nIt is not legal for you to drive.");
            } else if (bac < 0.08) {
                System.out.print( "\nIt is legal for you to drive.");
            }
        }
    }
}
