package diceRoller;
import java.util.concurrent.*;

public class Die {
	
	private int sides;

	public Die(int sides) {
		super();
		this.sides = sides;
	}
	
	public Die() {
		this.sides = 0;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		
		return ThreadLocalRandom.current().nextInt(1, sides + 1);
	}
	

}
