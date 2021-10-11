package diceRoller;

import java.util.ArrayList;

public class DiceRoller {
	
	private ArrayList<DiceRoll> diceRolls;
	private DiceRoll mostRecentDiceRoll;
	
	public DiceRoller() {
		
		diceRolls = new ArrayList<DiceRoll>();	
	}
	
	public void addRoll(int numberOfDice, int numberOfSides) {
		DiceRoll d = new DiceRoll(numberOfDice, numberOfSides);
		d.roll();
		diceRolls.add(d);
		mostRecentDiceRoll = d;
	}
	
	public ArrayList<DiceRoll> getDiceRolls() {
		return diceRolls;
	}
	
	public DiceRoll getMostRecentDiceRoll( ) {
		return mostRecentDiceRoll;
	}

}
