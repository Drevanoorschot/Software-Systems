package ss.week6.voteMachine;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VoteTUIView {
	private VoteMachine voteMachine;
	
	public VoteTUIView() {
		voteMachine = new VoteMachine();
	}
	
	public void start() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("User do input");
		}
	}

	public void showVotes(Map<String, Integer> voteList) {
		System.out.println(voteList.toString());
	}
	
	public void showParties(List<String> partyList) {
		System.out.println(partyList.toString());
	}
	
	public void showError(String errorMessage) {
		System.out.println("an error occurred");
	}
	
	public void getParties() {
		
	}
	
	public void getVotes() {
		
	}
}
