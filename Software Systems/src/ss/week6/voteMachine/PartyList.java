package ss.week6.voteMachine;

import java.util.ArrayList;

public class PartyList extends Observable {
	private ArrayList<String> partyList = new ArrayList<String>();

	public void addParty(String party) {
		partyList.add(party);
		setChanged(true);
	}
	
	public boolean hasParty(String party) {
		for (int i = 0; i < partyList.size(); i++) {
			if (party.equals(partyList.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<String> getParties() {
		return partyList;
	}
	
	public String getParty(int index) {
		return partyList.get(index);
	}
}
