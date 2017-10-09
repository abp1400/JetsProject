
public class Jets {

	String model;
	double speed;
	double range;
	String condition;
	double price;

	public Jets() {
	}

	public Jets(String model, double speed, double range, String condition, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.condition = condition;
		this.price = price;
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

	public String getCondition() {
		return condition;
	}

	public void setRepair(String condition) {
		this.condition = condition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
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
		builder.append(", condition=");
		builder.append(condition);
		builder.append(", price in millions USD=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	public double MilestoMach(double miles) {
		this.speed = miles * 0.00131;
		return speed;
	}

}
