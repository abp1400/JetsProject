import java.util.Scanner;

public class AppLauncher {

	public static void main(String[] args) {
		Airport airp = new Airport();
		Jets j = new Jets("null",0,0,"null",0);
		Scanner kb = new Scanner(System.in);
//		Scanner kb2 = new Scanner(System.in);

		System.out.println("Welcome to SD Airport. Here are your options: ");
		System.out.println("To view our fleet, press 1 (1): ");
		System.out.println("To view our fastest jet, press 2 (2): ");
		System.out.println("To view our jet with the longest range, press 3 (3): ");
		System.out.println("To add a jet to our fleet, press 4 (4): ");
		System.out.println("To quit this program, press 5 (5):");
		int choice = kb.nextInt();

		do {
			if (choice == 1) {
				airp.listJets();

			} else if (choice == 2) {
				airp.fastestJet();

			} else if (choice == 3) {
				airp.longestRange();

			} else if (choice == 4) {
				System.out.println("What model is your jet?");
				String model = kb.next();
				System.out.println("What is its speed in miles per hour?");
				double miles = kb.nextDouble();
				double speed = j.MilestoMach(miles);
				
				System.out.println("What is the range of your plane in miles?");
				double range = kb.nextDouble();
				
				System.out.println("What is the condition of your plane?");
				String repair = kb.next();
				
				System.out.println("What is the price of your plane?");
				double price = kb.nextDouble();
				
				Jets k = new Jets(model,speed,range,repair,price);
				airp.addJet(k);
				if(airp.addJet(k)==true) {
					
					System.out.println(k + " added to the SD Airport fleet.");
					airp.listJets();
		        }
		        else {
		          System.out.println("Sorry, airport full.");
		        }
				}
				

			 else if (choice == 5) {
				System.out.println("Good bye!");
				break;
			} else {
				System.out.println("Invalid choice, please try again!");
			}
			choice = kb.nextInt();
		} while (choice >= 1 && choice <= 5);

	}

}
