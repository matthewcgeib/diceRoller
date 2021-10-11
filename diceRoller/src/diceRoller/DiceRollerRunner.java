package diceRoller;

import java.util.Arrays;

public class DiceRollerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for (int i = 0; i < 40; i++)
		//{
			//Die d = new Die(6);
			//System.out.println(d.roll());
		//}
		DiceRoller dice = new DiceRoller(20, 6);
		dice.roll();
		
		System.out.println(Arrays.toString(dice.getNaturalResults()));
		System.out.println(Arrays.toString(dice.getSortedResultsAscending()));
		System.out.println(Arrays.toString(dice.getSortedResultsDescending()));

	}

}
