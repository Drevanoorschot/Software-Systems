package ss.week5;
import ss.week4.tictactoe.*;
import java.util.HashSet;
import java.util.Set;

public class NaiveStrategy implements Strategy {

	@Override
	public String getName() {
		return "Naive";
	}

	@Override
	public int determineMove(Board b, Mark m) {
		return randomMove(b, m);
	}
	public int randomMove(Board b, Mark m) {
		Set<Integer> emptyFields = new HashSet<>();
		for (int i = 0; i < Board.DIM * Board.DIM; i++) {
			if (b.getField(i).equals(Mark.EMPTY)) {
				emptyFields.add(i);
			}
		}
		int rand = (int) (Math.random() * emptyFields.size());
		int i = 0;
		int result = -1;
		for (Integer val : emptyFields) {
			if (i == rand) {
				result = val;
				break;
			}
			i++;
		}
		return result;
	}
	

}
