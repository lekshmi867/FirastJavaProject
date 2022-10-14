package methodAssignment;

import java.util.Scanner;

public class CellphonePlanSelection {

	Scanner sc = new Scanner(System.in);

	// Method for samsung model selection
	String samsungModelSelection() {
		String[] samsungModelList = { "S22", "S22+", "S22 ULTRA", "S22FE" };
		boolean isModelAvailable = false;
		for (int i = 0; i < samsungModelList.length; i++) {
			System.out.println(samsungModelList[i] + "\n");
		}
		String selectedModel = sc.nextLine().toUpperCase();
		for (int i = 0; i < samsungModelList.length; i++) {
			if (samsungModelList[i].equals(selectedModel)) {
				isModelAvailable = true;
				break;
			}
		}
		if (isModelAvailable) {
			return selectedModel;
		} else {
			return "";
		}

	}

	// Method for apple model selection
	String appleModelSelection() {
		String[] appleModelList = { "IPHONE 14", "IPHONE 14 PRO", "IPHONE 14 PRO MAX", "IPHONE 14 MINI" };
		boolean isModelAvailable = false;
		for (int i = 0; i < appleModelList.length; i++) {
			System.out.println(appleModelList[i] + "\n");
		}
		String selectedModel = sc.nextLine().toUpperCase();
		for (int i = 0; i < appleModelList.length; i++) {
			if (appleModelList[i].equals(selectedModel)) {
				isModelAvailable = true;
				break;
			}
		}
		if (isModelAvailable) {
			return selectedModel;
		} else {
			return "";
		}
	}


	// Method for samsung model price
	int samsungModelPrice(String selectedSamsungModel) {
		int samsungModelPrice = 0;
		switch (selectedSamsungModel) {
		case "S22":
			samsungModelPrice = 25;
			break;
		case "S22+":
			samsungModelPrice = 35;
			break;
		case "S22 ULTRA":
			samsungModelPrice = 55;
			break;
		case "S22FE":
			samsungModelPrice = 20;
			break;
		default:
			samsungModelPrice = 0;
			break;
		}
		return samsungModelPrice;

	}

	// Method for apple model price
	int appleModelPrice(String selectedAppleModel) {
		int appleModelPrice = 0;
		switch (selectedAppleModel) {
		case "IPHONE 14":
			appleModelPrice = 30;
			break;
		case "IPHONE 14 PRO":
			appleModelPrice = 40;
			break;
		case "IPHONE 14 PRO MAX":
			appleModelPrice = 65;
			break;
		case "IPHONE 14 MINI":
			appleModelPrice = 25;
			break;
		default:
			appleModelPrice = 0;
			break;
		}
		return appleModelPrice;

	}

	// Method for network plans
	int networkPlans(String selectedNetworkPlan) {
		int planCost = 0;

		if (selectedNetworkPlan.equalsIgnoreCase("Rogers")) {
			planCost = 70;
		} else if (selectedNetworkPlan.equalsIgnoreCase("Bell")) {
			planCost = 80;
		} else if (selectedNetworkPlan.equalsIgnoreCase("Telus")) {
			planCost = 75;
		} else
			planCost = 0;

		return planCost;
	}

	// Method for final bill
	void finalBillForModelAndPlan(String model, String plan, int modelCost, int planCost) {
		System.out.println("You have selected " + model + " with " + plan + " plan");
		System.out.println("Your Phone tab will be $" + modelCost);
		System.out.println("Your Montly Plan will be $" + planCost);
		int totalCost = modelCost + planCost;
		System.out.println("Total montly amount is $" + totalCost);
	}

}