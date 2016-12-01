package ss.week1;

public class DollarsAndCentsCounter {

	public int money;

	public DollarsAndCentsCounter() {
		money = 0;
	}

	public int dollars() { // dollar count
		return money / 100;
	}

	public int cents() { // cents count
		return money % 100;
	}

	public void add(int dollars, int cents) {
        money = money + dollars * 100 + cents;
	}

	public void reset() {
		money = 0;
	}

	public void substract(int dollars, int cents) {
		if (dollars < money / 100 && cents < money / 100) {
			money = money - (dollars * 100 + cents);
		} else {
			System.out.println("substraction too large");
		}
	}
}
