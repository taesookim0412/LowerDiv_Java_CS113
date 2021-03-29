import java.util.*;

//Author: Tae Soo Kim
//Logic: Pass

public class Exercise08_09 {
	Scanner sc = new Scanner(System.in);
	int[] board = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
	@SuppressWarnings("serial")
	HashMap<Integer, Character> playerMap = new HashMap<Integer, Character>() {{
		put(0, 'X');
		put(1, 'O');
	}};
	boolean boardRes = false;
	int winner = -1;
	
	
	private void scanBoardForWinner(int row, int col, int player) {
		if (winner == -5) return;
		//if diagonals
		if (board[0] == player && 
			board[4] == player &&
			board[8] == player){
				boardRes = true;
				winner = player;
		}
		else if (board[2] == player && 
				board[4] == player &&
				board[6] == player){
					boardRes = true;
					winner = player;
			}
		//Determine if the placed row/col produces a victory
		//Traverse the same row or col respectively
		else if (board[row*3] == player &&
				board[row*3 + 1] == player &&
				board[row*3 + 2] == player) {
			boardRes = true;
			winner = player;
		}
		else if (board[col] == player && 
				board[3 + col] == player &&
				board[6 + col] == player) {
			boardRes = true;
			winner = player;
		}
		
		
	}
	private void displayBoard() {
		boolean isDraw = true;
		for (int i = 0; i < board.length; i++) {
			if (board[i] == -1) isDraw = false;
			if (i % 3 == 0) System.out.println("-------------");
			String printStr = "   ";
			if (board[i] != -1) printStr = " " + playerMap.get(board[i]) + " ";
			System.out.print("|" + printStr);
			if ((i+1) % 3 == 0) System.out.println("|");
		}
		System.out.println("-------------");
		if (isDraw) {
			boardRes = true;
			winner = -5;
		}
		
	}
	private void mutateBoard(int row, int col, int player) {
		int index = (row)* 3 + (col);
		if (board[index] != -1) {
			boardRes = true;
			return;
		}
		board[index] = player;
		displayBoard();
		scanBoardForWinner(row, col, player);
	}
	//Player X: 0
	//Player Y: 1
	private void recvInput(int player) {
		char player_char = playerMap.get(player);
		System.out.print("Enter a row for player " + player_char + ": ");
		int inp1 = sc.nextInt();
		System.out.print("Enter a column for player " + player_char + ": ");
		int inp2 = sc.nextInt();
		System.out.println();
		mutateBoard(inp1, inp2, player);
	}
	
	//If you are not having enough input values you will have an error.
public static void main(String[] args) {
	Exercise08_09 obj = new Exercise08_09();
	int nextPlayer = 0;
	while (!obj.boardRes) {
		obj.recvInput(nextPlayer);
		nextPlayer = (nextPlayer + 1) & 1;
	}
	if (obj.winner == -1) {
		System.out.println("There was an error with input.");
	}
	else if (obj.winner == -5) {
		System.out.println("The game is a draw!");
	}
	else {
		System.out.println("Winner is player " + obj.playerMap.get(obj.winner) + "!");
	}
	
}
}

//Sample output: 

//	Interactive (X win):
//Enter a row for player X: 0
//Enter a column for player X: 0
//
//-------------
//| X |   |   |
//-------------
//|   |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: 1
//Enter a column for player O: 0
//
//-------------
//| X |   |   |
//-------------
//| O |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player X: 1
//Enter a column for player X: 1
//
//-------------
//| X |   |   |
//-------------
//| O | X |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: 2
//Enter a column for player O: 0
//
//-------------
//| X |   |   |
//-------------
//| O | X |   |
//-------------
//| O |   |   |
//-------------
//Enter a row for player X: 2
//Enter a column for player X: 2
//
//-------------
//| X |   |   |
//-------------
//| O | X |   |
//-------------
//| O |   | X |
//-------------
//Winner is player X!





//One line (X win):
//Enter a row for player X: 0 0 1 0 1 1 2 0 2 2
//Enter a column for player X: 
//-------------
//| X |   |   |
//-------------
//|   |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: Enter a column for player O: 
//-------------
//| X |   |   |
//-------------
//| O |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player X: Enter a column for player X: 
//-------------
//| X |   |   |
//-------------
//| O | X |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: Enter a column for player O: 
//-------------
//| X |   |   |
//-------------
//| O | X |   |
//-------------
//| O |   |   |
//-------------
//Enter a row for player X: Enter a column for player X: 
//-------------
//| X |   |   |
//-------------
//| O | X |   |
//-------------
//| O |   | X |
//-------------
//Winner is player X!





//Y win
//Enter a row for player X: 1 0  0 2  2 0  0 1 2 1 0 0
//Enter a column for player X: 
//-------------
//|   |   |   |
//-------------
//| X |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: Enter a column for player O: 
//-------------
//|   |   | O |
//-------------
//| X |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player X: Enter a column for player X: 
//-------------
//|   |   | O |
//-------------
//| X |   |   |
//-------------
//| X |   |   |
//-------------
//Enter a row for player O: Enter a column for player O: 
//-------------
//|   | O | O |
//-------------
//| X |   |   |
//-------------
//| X |   |   |
//-------------
//Enter a row for player X: Enter a column for player X: 
//-------------
//|   | O | O |
//-------------
//| X |   |   |
//-------------
//| X | X |   |
//-------------
//Enter a row for player O: Enter a column for player O: 
//-------------
//| O | O | O |
//-------------
//| X |   |   |
//-------------
//| X | X |   |
//-------------
//Winner is player O!

//Draw:
//Enter a row for player X: 0
//Enter a column for player X: 0
//
//-------------
//| X |   |   |
//-------------
//|   |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: 0
//Enter a column for player O: 1
//
//-------------
//| X | O |   |
//-------------
//|   |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player X: 0
//Enter a column for player X: 2
//
//-------------
//| X | O | X |
//-------------
//|   |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: 1
//Enter a column for player O: 0
//
//-------------
//| X | O | X |
//-------------
//| O |   |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player X: 1
//Enter a column for player X: 1
//
//-------------
//| X | O | X |
//-------------
//| O | X |   |
//-------------
//|   |   |   |
//-------------
//Enter a row for player O: 2
//Enter a column for player O: 2
//
//-------------
//| X | O | X |
//-------------
//| O | X |   |
//-------------
//|   |   | O |
//-------------
//Enter a row for player X: 2
//Enter a column for player X: 
//1
//
//-------------
//| X | O | X |
//-------------
//| O | X |   |
//-------------
//|   | X | O |
//-------------
//Enter a row for player O: 2
//Enter a column for player O: 0
//
//-------------
//| X | O | X |
//-------------
//| O | X |   |
//-------------
//| O | X | O |
//-------------
//Enter a row for player X: 1
//Enter a column for player X: 2
//
//-------------
//| X | O | X |
//-------------
//| O | X | X |
//-------------
//| O | X | O |
//-------------
//The game is a draw!



//1. If the computer was a player, I would alternate turns for each round by either alternating the playermap or before the loop, I would designate nextPlayer to add 1 each round. Then, as for the computer having turns, since this is a simple 3x3 board game it would be more efficient to create an actual algorithm instead of training a deep learning model in order to win. The algorithm would consist of first scanning for imminent defeats within one turn and blocking that path. If that is not necessary, then the computer would choose a random corner. If there is a victory available for the computer, then I would put before the previous step that the computer would place a winning mark.
//2. The simplest strategy that a computer could take is to always defend against a defeat. Or, choose the center of the board in order to prevent a corner-cut victory. If there is no imminent victory, a simple strategy without much consideration towards counterplay would have the computer choose a random location. Or, to choose the center of rows/columns in order to prevent the enemy from winning, which would result in more draws.
//3. The optimum strategy for the computer to take is to take corners at every turn while defending immediate defeats. The player that goes first always has the winning edge since the opponent will always have to play catch-up. 
//Here is an example with the first player being the computer.
//-------------
//| X |   | X |
//-------------
//| O |   |   |
//-------------
//| X |   | O |
//-------------
//Enter a row for player O:

