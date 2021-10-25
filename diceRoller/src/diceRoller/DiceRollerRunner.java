package diceRoller;

import java.util.Arrays;
import java.util.Scanner;


public class DiceRollerRunner {

	public static void main(String[] args) {
		int sides = 0;
		int number = 0;
		String errorMessage = "Input must be a positive integer";
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("Enter number of sides for each die");
			String userInput = input.next();
			if (isPositiveInt(userInput))
			{
				sides = Integer.parseInt(userInput);
				done = true;
			}
			else {
				System.out.println(errorMessage);
			}
		}
		done = false;
		while (!done) {
			System.out.println("Enter the number of dice");
			String userInput = input.next();
			if (isPositiveInt(userInput))
			{
				number = Integer.parseInt(userInput);
				done = true;
			}
			else {
				System.out.println(errorMessage);
			}
		}
		input.close(); 
		
		DiceRoll dice = new DiceRoll(number, sides);
		dice.roll();
		
		System.out.println("Natural order: " + Arrays.toString(dice.getNaturalResults()));
		System.out.println("Ascendeing order: " + Arrays.toString(dice.getSortedResultsAscending()));
		System.out.println("Descending order: " + Arrays.toString(dice.getSortedResultsDescending()));
		System.out.println("Total: " + dice.getTotal());
	}
	
	public static boolean isPositiveInt (String inString) {
		try {
			Integer.parseInt(inString);
		}
		catch(Exception e) {
			return false;
		}
		if (Integer.parseInt(inString) <= 0) {
			return false;
		}	
		return true;
	}
}
