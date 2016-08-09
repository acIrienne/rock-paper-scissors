import java.util.Random;

/**
 * RPS2 game application
 * This program generates the random number for the computer's throw,
 * and displays a message with who won.
 * @author Adrienne Cheng
 * April 9, 2015
 */

public class RPSGame {
	public static final int ROCK = 1, PAPER = 2, SCISSORS = 3; //assigns each option a static final int
	private int compThrow;
	private int playerWins = 0, computerWins = 0;

/**
* constructor
* pre: none
* post: RPSGame object created. Computer throw generated.
*/

public RPSGame() {
	Random rand = new Random();
	compThrow = rand.nextInt(3) + 1; //random int between 1 and 3
	playerWins = 0;			//sets the default amount of wins of the player and computer
	computerWins = 0;
}

/**
* Computer's throw is generated (ROCK, PAPER, or SCISSORS)
* pre: none
* post: Computer's throw has been made.
*/

public void makeCompThrow(){
	Random rand = new Random();
	compThrow = rand.nextInt(3) + 1; //random int between 1 and 3
}

/**
* Returns the computer's throw.
* pre: none
* post: Computer's throw has been returned.
*/

public int getCompThrow() {
	return(compThrow);		//returns the computers throw
}

/**
* Determines the winner of the round.
* pre: playerThrow is the integer 1, 2, or 3.
* post: Throw options are displayed. The player's throw is compared
* to the computer's throw.
*/

public void announceWinner(int playerThrow) {

	System.out.print(RPSPlayer.getName() + " throws ");
		switch (playerThrow) {
			case ROCK: System.out.println("ROCK."); break;
			case PAPER: System.out.println("PAPER."); break;
			case SCISSORS: System.out.println("SCISSORS."); break;
		}	


System.out.print("Computer throws ");
		switch (compThrow) {			//sets a switch statement for the 3 options so that each option prints out a certain line
			case ROCK: System.out.println("ROCK."); break;
			case PAPER: System.out.println("PAPER."); break;
			case SCISSORS: System.out.println("SCISSORS."); break;
		}
		
/* Determine and annouce winner */
		if (playerThrow == ROCK && compThrow == ROCK) {	//sets the rules for the game and each possible outcome with if and else if statements
			System.out.println("It's a draw!");
		} else if (playerThrow == ROCK && compThrow == PAPER) {
			System.out.println("Computer wins!");
			computerWins += 1;
		} else if (playerThrow == ROCK && compThrow == SCISSORS) {
			System.out.println("You win!");
			playerWins += 1;
		}

		if (playerThrow == PAPER && compThrow == ROCK) {
			System.out.println("You win!");
			playerWins += 1;
		} else if (playerThrow == PAPER && compThrow == PAPER) {
			System.out.println("It's a draw!");
		} else if (playerThrow == PAPER && compThrow == SCISSORS) {
			System.out.println("Computer wins!");
			computerWins +=1;
		}
	
		if (playerThrow == SCISSORS && compThrow == ROCK) {
			System.out.println("Computer wins!");
			computerWins += 1;
		} else if (playerThrow == SCISSORS && compThrow == PAPER) {
			System.out.println("You win!");
			playerWins += 1;
		} else if (playerThrow == SCISSORS && compThrow == SCISSORS) {
			System.out.println("It's a draw!");
		}
}	

/**
* Displays the overall winner.
* pre: none
* post: Computer and player wins compared and
* an overall winner announced.
*/

public void bigWinner() {  
	if (computerWins > playerWins){
			System.out.println("Computer wins!");
		} else if (playerWins > computerWins){
			System.out.println(RPSPlayer.getName() + " wins!");
		} else {
			System.out.println("It's a draw!");
		}
	}
}