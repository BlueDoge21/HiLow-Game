/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3u.assignment.pkg1.hilo;

import java.util.Scanner; 
/**
 *
 * @author Family
 */
public class ICS3UAssignment1HiLo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Riley Chai
        //October 8th, 2020
        System.out.println(" _______________");
        System.out.println("| /~~~~~~~~\\     ");
        System.out.println("||   HiLo   |...|");
        System.out.println("||   On     |   |");
        System.out.println("| \\________/  O |");
        System.out.println(" ~~~~~~~~~~~~~~~");
        
        int numberOfGuesses = 0;//Variable to track number of guesses
        int theNumber = (int) (Math.random()*5) + 1;//Randomize the number the user has to guess
        int theGuess;//Stores the users guess
        char Restart;//If the user wants to play again
        boolean gameState = true;//Turns the game off when false
        
        Scanner ScanChar = new Scanner(System.in);//Scanner for 'y' or 'n'
        
        Scanner ScanInt = new Scanner(System.in);//Scanner for int guesses
        System.out.print("Please guess a number from 1 to 5: ");
        theGuess = ScanInt.nextInt();//Detects and stores the user guess
        
        while(gameState == true)
        {        
          if(theGuess > theNumber)//If the guess is higher than the desired answer
          {
              numberOfGuesses++;//Adds one to the number of guesses
              System.out.println("Too high! Try again"); 
              System.out.print("Please guess a number from 1 to 5: ");
              theGuess = ScanInt.nextInt();//Detects and stores the user guess
          }
          
          else if(theGuess < theNumber)//If the guess is lower than the desired answer
          {
              numberOfGuesses++;
              System.out.println("Too low! Try again"); 
              System.out.print("Please guess a number from 1 to 5: ");
              theGuess = ScanInt.nextInt();
          }
          
          else//If the user guesses correctly
          {
              numberOfGuesses++;
              System.out.println("You Win!");
              System.out.println("You took " + numberOfGuesses + " attempts");//Prints the number of guesses they took
              System.out.print("Would you like to play again?(y/n): ");//Asks the user if they want to play again
              Restart = ScanChar.nextLine().charAt(0);//Detects the first character entered
              if(Restart == 'y')//If they respond with 'y'
              {
                  numberOfGuesses = 0;//Reset guesses
                  theNumber = (int) (Math.random()*5) + 1;//Randomize the answer
                  System.out.println(" ");//Adds a space to seperate from the previous guesses
                  System.out.print("Please guess a number from 1 to 5: ");
                  theGuess = ScanInt.nextInt();
              }
              else//If the user enters 'n'
              {
                  gameState = false;//Stops the while loop and exits the game
              }              
          }
        }
        System.out.println(" _______________");
        System.out.println("| /~~~~~~~~\\     ");
        System.out.println("||   HiLo   |...|");
        System.out.println("||   Off    |   |");
        System.out.println("| \\________/  O |");
        System.out.println(" ~~~~~~~~~~~~~~~");
    }  
}
