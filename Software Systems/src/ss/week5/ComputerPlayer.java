package ss.week5;

import ss.week4.tictactoe.Board;
import ss.week4.tictactoe.Mark;

public class ComputerPlayer extends ss.week4.tictactoe.Player {
	
	private Strategy strat;
	public ComputerPlayer(Mark mark, Strategy strategy) {
		super(strategy.getName() + "-" + mark, mark);
		strat = strategy;
	}

	public ComputerPlayer(Mark mark) {
		this(mark, new NaiveStrategy());
	}

	@Override
	public int determineMove(Board board) {
		return strat.determineMove(board, getMark());
	}
	
	public Strategy getStrategy() {
		return strat;
	}
	
	public void setStrategy(Strategy strategy) {
		strat = strategy;
	}

}
