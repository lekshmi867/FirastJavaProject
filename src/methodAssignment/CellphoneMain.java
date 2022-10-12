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
			String model = cp.samsungModelSelection();// Invoking method samsungModelSelection of class
														// CellphonePlanSelection
			System.out.println("Please enter the color that you want to buy from below");// Invoking method
																							// colorSelection of class
																							// CellphonePlanSelection
			String color = cp.colorSelection();
			if ((!model.equals("")) && (!color.equals(""))) {
				int modelCost = cp.samsungModelPrice(model);// Invoking method samsungModelPrice of class
															// CellphonePlanSelection
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String plan = sc.nextLine();
				int planPrice = cp.networkPlans(plan);// Invoking method networkPlans of class CellphonePlanSelection
				cp.billForModelAndPlan(modelCost, plan, planPrice, model);//Invoking method billForModelAndPlan
			} else {
				System.out.println("No match for that model");
			}
		} else if (choice.equalsIgnoreCase("apple")) {
			System.out.println("Please enter the model that you want to buy from below");
			String model = cp.appleModelSelection();// Invoking appleModelSelection method of class
													// CellphonePlanSelection
			System.out.println("Please enter the color that you want to buy from below");
			String color = cp.colorSelection(); // Invoking colorSelection method of class CellphonePlanSelection
			if ((!model.equals("")) && (!color.equals(""))) {
				int modelPrice = cp.appleModelPrice(model);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String planApple = sc.nextLine();// Invoking method networkPlans of class CellphonePlanSelection
				int planPrice = cp.networkPlans(planApple);
				cp.billForModelAndPlan(modelPrice, planApple, planPrice, model);//Invoking method billForModelAndPlan
			} else {
				System.out.println("No match for that model");
			}
		} else {
			System.out.println("No model selected");
		}

	}

}
