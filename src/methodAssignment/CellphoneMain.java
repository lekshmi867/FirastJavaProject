package methodAssignment;

/*Program to calculate cost of phone along with plan */
import java.util.Scanner;

public class CellphoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Instantiate the class CellphonePlanSelection
		CellphonePlanSelection cp = new CellphonePlanSelection();

		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		String choice = sc.nextLine();

		if (choice.equalsIgnoreCase("samsung")) {
			System.out.println("Please enter the model that you want to buy from below");

			// Invoking method samsungModelSelection of class CellphonePlanSelection
			String model = cp.samsungModelSelection();
			System.out.println("Please enter the color that you want to buy from below");
			// Invoking method colorSelection of class CellphonePlanSelection
			String color = cp.colorSelection();

			if ((!model.equals(""))&&(!color.equals(""))) {
				// Invoking method samsungModelPrice of class CellphonePlanSelection
				int modelCost = cp.samsungModelPrice(model);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String plan = sc.nextLine();

				// Invoking method networkPlans of class CellphonePlanSelection
				int planPrice = cp.networkPlans(plan);

				System.out.println("You have selected " + model + " with " + plan + " plan");
				System.out.println("Your Phone tab will be $" + modelCost);
				System.out.println("Your Montly Plan will be $" + planPrice);
				int totalCost = modelCost + planPrice;
				System.out.println("Total montly amount is $" + totalCost);
			} else {
				System.out.println("No match for that model");
			}

		} else if (choice.equalsIgnoreCase("apple")) {
			System.out.println("Please enter the model that you want to buy from below");
			// Invoking appleModelSelection method of class CellphonePlanSelection
			String model = cp.appleModelSelection();
			System.out.println("Please enter the color that you want to buy from below");
			// Invoking colorSelection method of class CellphonePlanSelection
			String color = cp.colorSelection();


			if ((!model.equals(""))&&(!color.equals(""))) {
				int modelPrice = cp.appleModelPrice(model);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String planApple = sc.nextLine();
				// Invoking method networkPlans of class CellphonePlanSelection
				int planPrice = cp.networkPlans(planApple);

				System.out.println("You have selected " + model + " with " + planApple + " plan");
				System.out.println("Your Phone tab will be $" + modelPrice);
				System.out.println("Your Montly Plan will be $" + planPrice);
				int totalAmount = modelPrice + planPrice;
				System.out.println("Total montly amount is $" + totalAmount);
			} else {
				System.out.println("No match for that model");
			}

		} else {
			System.out.println("No model selected");
		}

	}

}
