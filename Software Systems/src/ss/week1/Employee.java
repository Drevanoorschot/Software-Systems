package ss.week1;

public class Employee {
	public static void main(String[] args) {
		Employee employee = new Employee ();
		employee.payout();
		System.out.println("Salary:");
		System.out.println(employee.salary);
	}
	private static final int OVERTIME_HOURS = 40;
	private int hours; 		//hours worked 
	private double rate;	//hourly pay rate (dollar)
	private double salary;	//payout
	public Employee () {
		hours = 50;
		rate = 2.00;
	}
	public void payout () {
		if (hours <= OVERTIME_HOURS) {
			salary = hours*rate;
		}
		else {
			salary = OVERTIME_HOURS*rate + (hours-OVERTIME_HOURS)*(rate/2);
		}
	}
}
