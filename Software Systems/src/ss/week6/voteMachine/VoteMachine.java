package ss.week6.voteMachine;

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
		VoteTUIView view = new VoteTUIView();
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
	
	public PartyList getPartyList() {
		return partyList;
	}
	
	public VoteList getVoteList() {
		return voteList;
	}
}
