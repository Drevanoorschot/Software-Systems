package ss.week4.tictactoe;
import ss.week5.*;

/**
 * Executable class for the game Tic Tac Toe. The game can be played against the
 * computer. Lab assignment Module 2
 * 
 * @author Theo Ruys
 * @version $Revision: 1.4 $
 */
public class TicTacToe {
    public static void main(String[] args) {
    	if (args[0].equals("-N") && args[1].equals("-S")) {
    		ComputerPlayer p1 = new ComputerPlayer(Mark.OO);
    		ComputerPlayer p2 = new ComputerPlayer(Mark.XX, new SmartStrategy());
    		Game game = new Game(p1, p2);
        	game.start();
    	}
    	if (args[1].equals("-N")) {
    		HumanPlayer p1 = new HumanPlayer(args[0], Mark.OO);
    		ComputerPlayer p2 = new ComputerPlayer(Mark.XX);
    		Game game = new Game(p1, p2);
        	game.start();
    	} else if (args[1].equals("-S")) {
    		HumanPlayer p1 = new HumanPlayer(args[0], Mark.OO);
    		ComputerPlayer p2 = new ComputerPlayer(Mark.XX, new SmartStrategy());
    		Game game = new Game(p1, p2);
        	game.start();
    	} else {
    		HumanPlayer p1 = new HumanPlayer(args[0], Mark.OO);
            HumanPlayer p2 = new HumanPlayer(args[1], Mark.XX);
            Game game = new Game(p1, p2);
        	game.start();
    	}
    }
}
