//Nathan Blausey
//Date: 09/29/17

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
	public static void main (String[] arg)
	{
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	int cp = rand.nextInt(3);
	
	int player;
	
	System.out.println ("Choose Rock, Paper, or Scissors.");
	System.out.print ("Rock=0 Paper=1 Scissors=2: ");
	player = input.nextInt();
	
	int result = player-cp;
	
	if (cp == 0)
		System.out.print("The Computer chose Rock ");
	if (cp == 1)
		System.out.print("The Computer chose Paper ");
	if (cp == 2)
		System.out.print("The Computer chose Scissors ");
	
	if (player < 0 || player > 2)
		System.out.print ("you LOSE!\nYou did not choose a valid option.");
	else if (result == 0)
		System.out.println("you Tie.");
	else if (result == 1 || result == -2)
		System.out.println("you Win.");
	else if (result == -1 || result == 2)
		System.out.print ("you Lose.");
	
	}
}
//Please put the game logic under (cp == ) blocks
