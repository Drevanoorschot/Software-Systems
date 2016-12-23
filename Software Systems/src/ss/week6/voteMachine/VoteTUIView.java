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
		boolean running = true;
		System.out.println("Hello!");
		Scanner scanner = new Scanner(System.in);
		VoteTUIView view = new VoteTUIView();
		while (running) {
			String input = scanner.nextLine();
			String[] inputlist = input.split(" ");
			if (input.contains("VOTES")) {
				showVotes(voteMachine.getVoteList().getVotes());
			} else if (input.contains("ADD PARTY")) {
				voteMachine.addParty(inputlist[2]);
				showMessage("party added");
			} else if (input.contains("VOTE")) {
				voteMachine.vote(inputlist[1]);
			} else if (input.contains("PARTIES")) {
				showParties(voteMachine.getPartyList().getParties());
			} else if (input.contains("EXIT")) {
				System.out.println("Terminating...");
				running = false;
			} else if (input.contains("HELP")) {
				System.out.println("Commands:");
				System.out.println("VOTE [party]");
				System.out.println("ADD PARTY [party]");
				System.out.println("VOTES");
				System.out.println("PARTIES");
				System.out.println("EXIT");
				System.out.println("HELP");
			} else {
				view.showError("Unknown command");
			}
		}
		scanner.close();
	}

	public void showVotes(Map<String, Integer> voteList) {
		System.out.println(voteList.toString());
	}

	public void showParties(List<String> partyList) {
		System.out.println(partyList.toString());
	}

	public void showError(String errorMessage) {
		System.err.println(errorMessage);
		System.err.flush();
	}

	private void showMessage(String s) {
		System.out.println(s);
		System.out.flush();
	}
}
