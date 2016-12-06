package ss.week3.hotel;

public class PricedSafe extends Safe implements Bill.Item {
	public double sAmount;
	public String safe;
	
	public PricedSafe(double amount) {
		super();
		sAmount = amount;
		safe = "Safe";
	}
	public double getAmount() {
		return sAmount;
	}
	public String toString() {
		return safe + getAmount();
	}
}
