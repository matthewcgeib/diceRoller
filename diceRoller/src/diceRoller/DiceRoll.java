package diceRoller;

import java.util.concurrent.*;
import java.util.Arrays;
import java.util.Collections;

public class DiceRoll {
	
	private int numberOfDice;
	private int sides;
	private Integer [] results;
	private int total;
	private Integer [] ascendingResults;
	private Integer [] descendingResults;
	
	public DiceRoll(int numberOfDice, int sides) {
		super();
		this.numberOfDice = numberOfDice;
		this.sides = sides;
		this.results = new Integer [numberOfDice];
	}
	
	public void roll() {
		
		for (int i = 0; i < numberOfDice; i++) {
			results[i] = ThreadLocalRandom.current().nextInt(1, sides +  1);
			total = total + results[i];			
		}
		ascendingResults = results.clone();
		Arrays.sort(ascendingResults);
		descendingResults = results.clone();
		Arrays.sort(descendingResults, Collections.reverseOrder());		
	}
	
	public Integer [] getNaturalResults() {
		return results;
	}
	
	public Integer [] getSortedResultsAscending() {
		return ascendingResults;	
	}
	
	public Integer [] getSortedResultsDescending() {
		return descendingResults;
	}
	
	public int getTotal() {
		return total;
	}
	
	
}
