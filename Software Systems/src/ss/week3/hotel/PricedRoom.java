package ss.week3.hotel;

public class PricedRoom extends Room implements Bill.Item {
	public double rPrice;
	public double sPrice;

	public PricedRoom(int no, double roomPrice, double safePrice) {
		super(no, safePrice);
		rPrice = roomPrice;
	}

	public double getAmount() {
		return rPrice;
	}
	@Override
	public String toString() {
		return super.toString() + String.valueOf(rPrice);
	}
}
