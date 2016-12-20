package ss.week5;

import ss.week4.tictactoe.Board;
import ss.week4.tictactoe.Mark;

public class SmartStrategy extends NaiveStrategy {

	@Override
	public String getName() {
		return "Smart";
	}

	@Override
	public int determineMove(Board b, Mark m) {
		if (b.getField(Board.DIM / 2, Board.DIM / 2) == Mark.EMPTY) {
			return (Board.DIM * Board.DIM) / 2;
		}
		for (int i = 0; i < Board.DIM * Board.DIM; i++) {
			Board boardCopy = b.deepCopy();
			if (b.getField(i) == Mark.EMPTY) {
				boardCopy.setField(i, m);
			}
			if (boardCopy.hasWinner() == true) {
				return i;
			}
		}
		for (int i = 0; i < Board.DIM * Board.DIM; i++) {
			Board boardCopy = b.deepCopy();
			boardCopy.setField(i, m.other());
			if (boardCopy.hasWinner() == true) {
				return i;
			}
		}
		return randomMove(b, m);
	}

}
