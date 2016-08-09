import java.util.Scanner;

/**
 * RPS2 part 2 of 2
 * The RPS2 game part 2 now includes client code that is able to ensure
 * that user's enter a valid option that is either: 1, 2, or 3.
 * @author Adrienne Cheng
 * April 9, 2015
 */

public class RPS2_2 {
	public static void main(String[] args) {
		int rounds; //sets the int for rounds and the value of the players throw
		int playerThrow;		
						
	RPSGame rps = new RPSGame();		//sets an object called rps game
	RPSPlayer rpsOpponent = new RPSPlayer();	//sets object for the player
	
	Scanner input = new Scanner(System.in);		//imports the scanner
	
	System.out.println("What is your name?");	//asks the user for their name and passes it through to rpsOpponent.
	rpsOpponent.assignName(input.nextLine());
	
	/* play RPS */
	System.out.print("How many rounds? "); //asks the uses for how many rounds they want to play
	rounds = input.nextInt();			//sets the amount of rounds according to the player.
		for (int i = 0; i < rounds; i++) {		//for loop for rock paper scissors
			System.out.print("Enter your throw (ROCK=1, " + "PAPER=2, SCISSORS=3): ");	//asks the users for their choice and tells them their options
			playerThrow = input.nextInt();	//sets the variable that the user gives
	
			if ( 0 < playerThrow && playerThrow <= 3 ){  //if the players choice is between 1 and 3, throws the users choice
				rpsOpponent.makeThrow(playerThrow);
				rps.makeCompThrow();
				rps.announceWinner(rpsOpponent.getThrow());
			}
	
			else {	//else tells the user that their choice is not valid and lowers the value of i so that a turn is not taken.
				System.out.println("That is not an valid option");
				i--;
			}
		}
		
		rps.bigWinner();			//announces the final winner
		input.close();			//closes the input.
	}
}
