package ss.week6.voteMachine;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	private boolean changed;
	private List<Observer> observers;
	
	public Observable() {
		observers = new ArrayList<>();
		changed = false;
	}
	
	public void setChanged(boolean s) {
		changed = s;
	}
	
	public void notifyObserver(String choice) {
		if (choice.equals("party")) {
			System.out.println("party added");
		} else if (choice.equals("vote")) {
			System.out.println("vote has been cast");
		}
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public boolean hasChanged() {
		return changed;
	}
}
