package assignmentMajorProject;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class RocketMain {

	public static void main(String[] args) throws FileNotFoundException {
		Simulation simulation = new Simulation();
		// R1
		ArrayList<Rocket> rocketList = new ArrayList<>();
		rocketList = simulation.loadR1();
		Rocket rocket = new R1();
		System.out.println("************************************R1 Rocket********************************************");
		int budgetForR1 = simulation.runSimulation(rocketList, rocket);
		System.out.println("Total cost for R1 fleet " + budgetForR1);
		System.out.println("*****************************************************************************************");

		// R2
		rocketList = new ArrayList<>();
		rocketList = simulation.loadR2();
		rocket = new R2();
		System.out.println("************************************R2 Rocket********************************************");
		int budgetForR2 = simulation.runSimulation(rocketList, rocket);
		System.out.println("Total cost for R2 fleet " + budgetForR2);
		System.out.println("*****************************************************************************************");
	}

}
