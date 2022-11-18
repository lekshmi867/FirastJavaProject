package assignmentMajorProject;

import java.util.Random;

public class Rocket implements SpaceShip{
	
	private int totalWeight;
	private int maximumWeight;
	private int cost;
	Random rand = new Random();
	
	public int getCost() {
		return cost;
	}
	
	public Rocket(int maximumWeight) {
		this.maximumWeight = maximumWeight;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public int getMaximumWeight() {
		return maximumWeight;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		return totalWeight+item.weight<=maximumWeight;
	}

	@Override
	public void carry(Item item) {
		totalWeight = totalWeight+item.weight;
	}
	public double getRandomNumber() {
		double randomNumber = (Math.random())/10;
		return randomNumber;
	}

}
