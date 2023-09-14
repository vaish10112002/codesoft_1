package codesoft2;

import java.util.Scanner;
public class Numbergame {


       public static void guessingNumberGame()
	{
	   Scanner sc = new Scanner(System.in);
	   int number = 1 + (int)(100 * Math.random());
	   int K = 10;
           int i, guess;
           System.out.println("Guess the number between 1 to 100 within 10 trials.");
           for (i = 0; i < K; i++) 
           {
               System.out.println("Enter the Guess number:");
               guess = sc.nextInt();
	       if (number == guess) 
                {
		  System.out.println("Congratulations!"+ " You guessed the correct number.");
		  break;
		}
		else if (number > guess && i != K - 1)
                {
		  System.out.println("The number is greater than " + guess);
		}
		else if (number < guess && i != K - 1)
                {
		  System.out.println("The number is less than " + guess);
		}
	    }
                if (i == K)
                {
		System.out.println("You have finished"+ " 10 trials.");
                System.out.println("The correct number was " + number);
		}
	}

	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
