package ss.week6.voteMachine;

public class VoteMachine {
	private static PartyList partyList;
	private static VoteList voteList;
	
	
	public static void main(String[] args) {
		start();
		partyList = new PartyList();
		voteList = new VoteList();
	}
	
	public static void start() {
		
	}
	
	public static void addParty(String party) {
		partyList.addParty(party);
	}
	
	public static void vote(String party) {
		voteList.addVote(party);
	}
}
