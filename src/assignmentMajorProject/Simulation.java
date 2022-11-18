package assignmentMajorProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	private ArrayList<Item> load() throws FileNotFoundException {
		File file = new File("C:\\Users\\user\\Desktop\\phase-1.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Item> itemList = new ArrayList<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] itemWeight = line.split("=");
			itemList.add(new Item(itemWeight[0], Integer.valueOf(itemWeight[1])));
		}
		return itemList;

	}

	ArrayList<Rocket> loadR1() throws FileNotFoundException {
		ArrayList<Item> itemList = new ArrayList<>();
		itemList = load();
		ArrayList<Rocket> rocketList = new ArrayList<>();
		Rocket rocket = new R1();
		rocketList.add(rocket);
		for (Item item : itemList) {
			if(rocket.canCarry(item)) {
				rocket.carry(item);
			}else {
				 rocket = new R1();
				 rocketList.add(rocket);
				 rocket.carry(item);
			}		
		}
		return rocketList;
	}
	
	ArrayList<Rocket> loadR2() throws FileNotFoundException {
		ArrayList<Item> itemList = new ArrayList<>();
		itemList = load();
		ArrayList<Rocket> rocketList = new ArrayList<>();
		Rocket rocket = new R2();
		rocketList.add(rocket);
		for (Item item : itemList) {
			if(rocket.canCarry(item)) {
				rocket.carry(item);
			}else {
				 rocket = new R2();
				 rocketList.add(rocket);
				 rocket.carry(item);
			}			
		}
		return rocketList;
	}
	
	int runSimulation(ArrayList<Rocket> rocketList, Rocket rocket ) {
		int numberOfSuccessAttempts =0;
		int numberOfReAttempts =0;
		for(Rocket r : rocketList) {
			while((!r.launch())||(!r.land())) {
				numberOfReAttempts++;
			}
			numberOfSuccessAttempts++;
		}
		int budget = rocket.getCost()*(numberOfReAttempts+numberOfSuccessAttempts);
		String reAttempt = String.format("Number of reattempts to lauch the rocket %d",numberOfReAttempts);
		String successAttempt = String.format("Number of success attempts to lauch the rocket %d",numberOfSuccessAttempts);
		System.out.println(reAttempt);
		System.out.println(successAttempt);
		return budget;
	}

}
