import java.util.Scanner;

public class AppLauncher {

	public static void main(String[] args) {

		Airport airp = new Airport();
		Jets a = new Jets();
		Scanner kb = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("Welcome to SD Airport. Here are your options: ");
			System.out.println("To view our fleet, press 1 (1): ");
			System.out.println("To view our fastest jet, press 2 (2): ");
			System.out.println("To view our jet with the longest range, press 3 (3): ");
			System.out.println("To add a jet to our fleet, press 4 (4): ");
			System.out.println("To quit this program, press 5 (5):");
			choice = kb.nextInt();

			if (choice == 1) {
				airp.listJets();
				System.out.println(" ");
			} else if (choice == 2) {
				airp.fastestJet();
				System.out.println(" ");
			} else if (choice == 3) {
				airp.longestRange();
				System.out.println(" ");
			} else if (choice == 4) {

				System.out.println("Add a jet to the fleet.");
				System.out.println("What is the model of the jet? ");
				String model = kb.next();
				System.out.println("What is the speed of the jet in MPH? ");
				double miles = kb.nextFloat();
				double speed = a.MilestoMach(miles);
				System.out.println("What is the range of the jet in miles? ");
				double range = kb.nextFloat();
				System.out.println("What is the condition of your plane?");
				String condition = kb.next();
				System.out.println("What is the price of the jet in millions USD? ");
				double price = kb.nextDouble();
				Jets j = new Jets(model, speed, range, condition, price);
				if (airp.addJet(j)) {
					System.out.println(j + " added to SD Airport.");
				} else {
					System.out.println("Sorry, the airport is full.");
					System.out.println(" ");
				}

				airp.listJets();
				System.out.println(" ");
			} else if (choice == 5) {
				System.out.println("Good bye!");
				break;
			} else {
				System.out.println("Invalid choice, please try again!");
			}

		} while (choice != 5);

	}
}
