package ss.week6.voteMachine;

import ss.week6.voteMachine.gui.VoteGUIView;

public class VoteMachine {
	private PartyList partyList;
	private VoteList voteList;
	public VoteMachine() {
		partyList = new PartyList();
		voteList = new VoteList();
	}
	
	public static void main(String[] args) {
		VoteMachine voteMachine = new VoteMachine();
		voteMachine.start();
	}
	
	public void start() {
		VoteGUIView view = new VoteGUIView(this);
		partyList.addObserver(view);
		voteList.addObserver(view);
		view.start();
	}
	
	public void addParty(String party) {
		partyList.addParty(party);
	}
	
	public boolean vote(String party) {
		if (partyList.hasParty(party)) {
			voteList.addVote(party);
			return true;
		} else {
			return false;
		}
	}
	
	public PartyList getParties() {
		return partyList;
	}
	
	public VoteList getVoteList() {
		return voteList;
	}
}
