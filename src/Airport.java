import java.util.*;

public class Airport {

		public Jets [] jets;
		
		
	public Airport() {
		jets = new Jets[5];
		jets[0] = new Jets("Boeing", 1.1, 700, "good", 10000000);
		jets[1] = new Jets("Airbus", 1.7, 850, "good",9000000);
		jets[2] = new Jets("Bombadier", 0.8, 500, "good", 500000);
		jets[3] = new Jets("Embraer", 0.66, 450, "non-functional", 2000000);
		jets[4] = new Jets("Gulfstream", 0.5, 400, "non-functional", 100000);
		
		
	}

	public void listJets() {
		System.out.println("== Jets in this airport ==");
		for (int i = 0; i < jets.length; i++) {
			{
				if (jets[i] != null) {
					System.out.println(jets[i]);
				}
			}
		}
	}
	
	public void fastestJet() {
		 Jets fastest = new Jets(null,0,0.0,null,0);
		// fastest.speed = jets[0].speed;
		 fastest = jets[0];
		 for(int i = 1; i < jets.length; i++) { 
			 if(jets[i]!=null) {
		 		if (jets[i].speed >fastest.speed) {
					fastest.speed = jets[i].speed;
					fastest.model = jets[i].model;
					fastest.range = jets[i].range;
					fastest.repair = jets[i].repair;
					fastest.price = jets[i].price;
			}
		}
						 
		 }
			System.out.println("The fastest jet in our fleet is the " + fastest.model + " with a speed of Mach: " + fastest.speed);
			System.out.println("with a range of " + fastest.range +" miles.  It is in "+fastest.repair + " condition, and has a price of "
					+ fastest.price +" dollars");

	}
	
	public void longestRange() {
		 Jets longest = new Jets(null,0,0.0,null,0);
		// longest.speed = jets[0].speed;
		 longest = jets[0];
		 for(int i = 1; i < jets.length; i++) { 
			 if(jets[i]!=null) {
		 		if (jets[i].range >longest.range) {
					longest.range = jets[i].range;
					longest.model = jets[i].model;
					longest.speed = jets[i].speed;
					longest.repair = jets[i].repair;
					longest.price = jets[i].price;
			}
		}
						 
		 }
			System.out.println("The jet with the greatest range in our fleet is the " + longest.model + " with a range of : " + longest.range + " miles.");
			System.out.println("with a speed of Mach: " + longest.speed + "  It is in "+ longest.repair + " condition, and has a price of "
					+ longest.price +" dollars");

	}
	
	 public boolean addJet(Jets k) {
	      boolean added = false;
	      for (int i = 0; i < jets.length; i++) {
	      if (jets[i] == null) {
	        jets[i] = k;
	        added = true;
	        break;
	      }
	    }
	      return added;
	    }

}
	
	


