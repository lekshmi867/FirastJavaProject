package methodAssignment;

import java.util.Scanner;

public class CellphonePlanSelection {

	Scanner sc = new Scanner(System.in);
	

	//Method for samsung model selection
	String samsungModelSelection() {
		String[] samsung = { "S22", "S22+", "S22 ULTRA", "S22FE" };
		boolean isModelAvailable = false;
		for (int i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i] + "\n");
		}
		String modelSamsung = sc.nextLine().toUpperCase();
		for (int i = 0; i < samsung.length; i++) {
			if (samsung[i].equals(modelSamsung)) {
				isModelAvailable = true;
				break;
			}
		}
		if (isModelAvailable) {
			return modelSamsung;
		} else {
			return "";
		}

	}

	
	//Method for apple model selection
	String appleModelSelection()
	{
		String[] apple = { "IPHONE 14", "IPHONE 14 PRO", "IPHONE 14 PRO MAX", "IPHONE 14 MINI" };
		boolean isModelAvailable = false;
		for (int i = 0; i < apple.length; i++) {
			System.out.println(apple[i] + "\n");
		}
		String modelApple = sc.nextLine().toUpperCase();
		for (int i = 0; i < apple.length; i++) {
			if (apple[i].equals(modelApple)) {
				isModelAvailable = true;
				break;
			}
		}
		if (isModelAvailable) {
			return modelApple;
		} else {
			return "";
		}
	}
	
	//Method for  color selection
		String colorSelection()
		{
			String[] color = { "BLACK", "GREEN", "RED", "BLUE", "PINK" };
			boolean isColorAvailable = false;
			for (int i = 0; i < color.length; i++) {
				System.out.println(color[i] + "\n");
			}
			String modelColor = sc.nextLine().toUpperCase();
			for (int i = 0; i < color.length; i++) {
				if (color[i].equals(modelColor)) {
					isColorAvailable = true;
					break;
				}
			}
			if (isColorAvailable) {
				return modelColor;
			} else {
				return "";
			}
		}
	

	//Method for samsung model price
	int samsungModelPrice(String samsungModel) {
		int samsungPrice = 0;
		switch (samsungModel) {
		case "S22":
			samsungPrice = 25;
			break;
		case "S22+":
			samsungPrice = 35;
			break;
		case "S22 ULTRA":
			samsungPrice = 55;
			break;
		case "S22FE":
			samsungPrice = 20;
			break;
		default:
			samsungPrice = 0;
			break;
		}
		return samsungPrice;

	}

	//Method for apple model price
	int appleModelPrice(String appleModel) {
		int applePrice = 0;
		switch (appleModel) {
		case "IPHONE 14":
			applePrice = 30;
			break;
		case "IPHONE 14 PRO":
			applePrice = 40;
			break;
		case "IPHONE 14 PRO MAX":
			applePrice = 65;
			break;
		case "IPHONE 14 MINI":
			applePrice = 25;
			break;
		default:
			applePrice = 0;
			break;
		}
		return applePrice;

	}

	//Method for network plans
	int networkPlans(String plan) {
		int planCost = 0;

		if (plan.equalsIgnoreCase("Rogers")) {
			planCost = 70;
		} else if (plan.equalsIgnoreCase("Bell")) {
			planCost = 80;
		} else if (plan.equalsIgnoreCase("Telus")) {
			planCost = 75;
		} else
			planCost = 0;

		return planCost;
	}
	//Method for final bill
	void billForModelAndPlan(int modelCost, String plan, int planCost, String model ) {
		System.out.println("You have selected " + model + " with " + plan + " plan");
		System.out.println("Your Phone tab will be $" + modelCost);
		System.out.println("Your Montly Plan will be $" + planCost);
		int totalCost = modelCost + planCost;
		System.out.println("Total montly amount is $" + totalCost);
	}

}