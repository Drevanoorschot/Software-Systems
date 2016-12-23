package ss.week6.voteMachine;

public class Observable {
	private boolean isChanged = false;
	
	public void setChanged() {
		isChanged = true;
	}
	
	public void notifyObserver(String choice) {
		if (choice.equals("party")) {
			System.out.println("party added");
		}
		if (choice.equals("vote")) {
			System.out.println("vote has been cast");
		}
	}
	
	public void addObserver() {
		
	}
	
	public boolean hasChanged() {
		return isChanged;
	}
}
