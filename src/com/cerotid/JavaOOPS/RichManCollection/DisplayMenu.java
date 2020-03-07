package com.cerotid.JavaOOPS.RichManCollection;

import java.util.Scanner;

import com.cerotid.JavaOOPS.UserInputExceptions.InvalidUserInputException;

public class DisplayMenu {

	RichManUtilities richManUtilities = new RichManUtilities();
	Scanner input = new Scanner(System.in);

	public void displayMenu() {

		System.out.println(
				"Hi RichMan, Welcome to Car Service Portal. Please ENTER the specefic key as your requirement...");
		String userChoice;
		int cont = 1;

		while (cont == 1) {
			System.out
					.println("Press a to add a new car, \nPress b to modify car features, \nPress c to repaint a car, "
							+ "\nPress d to perform regular services(Oil change & Tire service) at Walmart, \nPress e to exit");
			System.out.print("PLESE ENTER YOUR CHOICE HERE: ");
			userChoice = input.next();

			if (userChoice.equals("a") || userChoice.equals("b") || userChoice.equals("c") || userChoice.equals("d")
					|| userChoice.equals("e")) {
				switch (userChoice) {

				case "a": {
					System.out.print(
							"\nPlease choose type of a car you want to add in your collection. \nYour options are: Camaro, Challenger, "
									+ "Mustang, Sedan, Volester, Spark \nPLESE ENTER HERE: ");
					String carType = input.next();
					richManUtilities.addCar(carType);
				}
					break;

				case "b": {
					boolean androidFeature = false, carPlayFeature = false;

					System.out.print("Please enter vin to modify car features: ");
					String vin = input.next();
					System.out.println("Enter 'Yes' to add Android auto feature: ");
					String addAandroidFeature = input.next();
					if (addAandroidFeature.equalsIgnoreCase("Yes")) {
						androidFeature = true;
					}
					System.out.println("Enter 'Yes' to add car play feature: ");
					String addCarPlayFeature = input.next();
					if (addCarPlayFeature.equalsIgnoreCase("Yes")) {
						carPlayFeature = true;
					}
					try {
						richManUtilities.modifyCarFeature(vin, androidFeature, carPlayFeature);
					} catch (InvalidUserInputException e) {
						e.printStackTrace();
					}
				}
					break;

				case "c": {

					System.out.print("Please select the car you want to repaint: ");
					String carName = input.next();
					System.out.println("Choose the color you want to repaint: ");
					String color = input.next();
					richManUtilities.repaintCar(carName, color);

				}
					break;

				case "d": {

				}
					break;

				case "e": {
					cont = 0;
				}
					break;

				}
			} else {
				try {
					throw new InvalidUserInputException("Your input is Worng. Please choose the correct alphabet");
				} catch (InvalidUserInputException e) {
					System.out.println(e);
				}
			}

			System.out.print(
					"\nCONTINUE or CONFIRM QUIT?\nENTER 1 to CONTINUE in Car Service Portal OR any other number to QUIT. \nPLEASE ENTER HERE: ");
			int add = input.nextInt();
			if (add == 1) {
				cont = 1;
			} else {
				cont = 0;
				System.out.println("Thank you for using Car Service Portal");
			}
		}
	}
}
