package diceRoller;

import java.util.Arrays;
import java.util.Scanner;

public class DiceRollerRunner {

	public static void main(String[] args) {
		int sides = 0;
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of sides for each die");
		sides = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the number of dice");
		number = Integer.parseInt(input.nextLine());
		
		DiceRoll dice = new DiceRoll(number, sides);
		dice.roll();
		
		System.out.println("Natural order :" + Arrays.toString(dice.getNaturalResults()));
		System.out.println("Ascendeing order :" + Arrays.toString(dice.getSortedResultsAscending()));
		System.out.println("Descending order :" + Arrays.toString(dice.getSortedResultsDescending()));
		System.out.println("Total :" + dice.getTotal());

	}

}
