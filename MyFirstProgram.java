/* 
 * Chapter No. 1    Excercise No. 1
 * File Name: MyFirstProgram.java
 * @author: Eric Schenck
 * Date: August 20, 2012
 * 
 * Problem Statement: Ask the user three numbers, calculate the sum of 
 * these three numbers, and display the sum to the screen
 * 
 * Overall plan:
 * 1.) Print an initial welcoming message to the screen
 * 2.) Prompt the user to enter three integers
 * 3.) Calculate the sum of those three integers
 * 4.) Divide the sum of those three numbers by the product of those same 
 * numbers
 * 5.) Print the sum of the integers to the screen
 * 
 * Classes that are need and the purpose: 'java.util' will be needed for general
 * purpose input and output from the terminal
 * 
 */


import java.util.Scanner;
/*
 * Note, you could use import java.util.*; this lets other programmers know 
 * exactly what you are using.
 */


public class MyFirstProgram 
{

    public static void main(String[] args) 
    {
        // print a message to the screen
  System.out.println("Hello in there.");
  System.out.println("I will multiply any three numbers you can give me.");
  System.out.println("Then i think i will divide your answere by itself.");
  System.out.println("Cuz im wierd like that...");
  System.out.println("But don't worry ill make sure to tell you both answers");
  System.out.println("Go ahead and enter three numbers for me too calculate.");
        
        // declare five integer variables
        int n1, n2, n3, n4, n5, sum, answere;
        
        //create an instance of the new Scanner class for user input
        Scanner keyboard = new Scanner(System.in);
        
        // get three integer numbers from the user
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        
        //calculate the sum of these three numbers
        sum = n1 * n2 * n3;
        
        //setting the sum of those three numbers equal to n4 and n5
        n4 = ( sum );
        n5 = ( sum );
       
        //dividing the sum of the calculation by itself 
        answere = n4 / n5;
       
       
        //print a message along with the sum of the numbers
        //print a message along with the division sum
        System.out.println("The sum of the three numbers is");
        System.out.println( sum );
        System.out.println("... and a little further");
        System.out.println(" Boom!");
        System.out.println( answere );
        
       
       
     } // end of main
}    // end of class MyFirstProgram
