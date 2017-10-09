
public class Airport {

	private Jets[] jets;

	public Airport() {
		jets = new Jets[7];
		jets[0] = new Jets("Boeing", 0.85, 9800, "new", 300);
		jets[1] = new Jets("Airbus", 0.90, 8900, "new", 311);
		jets[2] = new Jets("Bombadier", 0.78, 3800, "good", 85);
		jets[3] = new Jets("Embraer", 0.80, 3000, "needs repair", 60);
		jets[4] = new Jets("Gulfstream", 0.75, 5000, "non-functional", 65);
	}

	public void listJets() {
		System.out.println("== Jets in this airport ==");
		for (int i = 0; i < jets.length; i += 1) {
			if (jets[i] != null) {
				System.out.println(jets[i]);
			}
		}
	}

	public void fastestJet() {
		Jets fastest = new Jets(null, 0, 0.0, null, 0);
		fastest = jets[0];
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > fastest.getSpeed()) {
					fastest.speed = jets[i].getSpeed();
					fastest.model = jets[i].getModel();
					fastest.range = jets[i].getRange();
					fastest.condition = jets[i].getCondition();
					fastest.price = jets[i].getPrice();
				}
			}

		}
		System.out.println(
				"The fastest jet in our fleet is the " + fastest.model + " with a speed of Mach: " + fastest.speed);
		System.out.println("with a range of " + fastest.range + " miles.  It is in " + fastest.condition
				+ " condition, and has a price of " + fastest.price + " million US dollars");

	}

	public void longestRange() {
		Jets longest = new Jets(null, 0, 0.0, null, 0);
		longest = jets[0];
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longest.getRange()) {
					longest.range = jets[i].getRange();
					longest.model = jets[i].getModel();
					longest.speed = jets[i].getSpeed();
					longest.condition = jets[i].getCondition();
					longest.price = jets[i].getPrice();
				}
			}

		}
		System.out.println("The jet with the greatest range in our fleet is the " + longest.model
				+ " with a range of : " + longest.range + " miles.");
		System.out.println("with a speed of Mach: " + longest.speed + "  It is in " + longest.condition
				+ " condition, and has a price of " + longest.price + " million US dollars");

	}

	public boolean addJet(Jets a) {
		boolean added = false;
		for (int i = 0; i < jets.length; i += 1) {
			if (jets[i] == null) {
				jets[i] = a;
				added = true;
				break;
			}
		}
		return added;
	}
}
