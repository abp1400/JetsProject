
public class Jets {
	    
	    String model;
	    double speed;
	    double range;
	    String repair;
	    double price;
		
	    public Jets(String model, double speed, double range, String repair, double price) {
			super();
			this.model = model;
			this.speed = speed;
			this.range = range;
			this.repair = repair;
			this.price = price;
		}

	    public Jets(){
	    	super();
	    }

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getRange() {
			return range;
		}

		public void setRange(double range) {
			this.range = range;
		}

		public String getRepair() {
			return repair;
		}

		public void setRepair(String repair) {
			this.repair = repair;
		}

		public double getPrice() {
			return price;
		}

		public void setCapacity(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Jets [model=");
			builder.append(model);
			builder.append(", speed in Mach=");
			builder.append(speed);
			builder.append(", range=");
			builder.append(range);
			builder.append(", repair=");
			builder.append(repair);
			builder.append(", price=");
			builder.append(price);
			builder.append("]");
			return builder.toString();
		}
	    public double MilestoMach(double miles) {
	    	this.speed = miles*0.00131;
	    	return speed;
	    }
	    		
	    		
}


