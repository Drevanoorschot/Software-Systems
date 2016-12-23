package ss.week6.voteMachine;

import java.util.HashMap;
import java.util.Map;

public class VoteList extends Observable {
	private Map<String, Integer> voteList = new HashMap<String, Integer>();
	
	public void addVote(String party) {
		if (voteList.containsKey(party)) {
			int i = voteList.get(party);
			i++;
			voteList.put(party, i);
		} else {
			voteList.put(party, 1);
		}
		
	}
	
	public Map<String, Integer> getVotes() {
		return voteList;
	}
}
