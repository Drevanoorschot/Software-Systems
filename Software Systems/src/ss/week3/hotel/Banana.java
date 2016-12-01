package ss.week3.hotel;

public class Banana implements Bill.Item {
	public double bAmount;
	public String info;

	public Banana(String text, double amount) {
		bAmount = amount;
		info = text;
	}

	public double getAmount() {
		return bAmount;
	}

	public String toString() {
		return info;
	}
}
