/**
 * RPS Player class of the RPS2 game application
 * The Player class stores the player's name and the throw method.
 * @author Adrienne Cheng
 * April 9, 2015
 */

public class RPSPlayer {
	private int playerThrow; //ROCK=1, PAPER=2, SCISSORS=3
	private static String playerName;

/**
* constructor
* pre: none
* post: RPSPlayer object created. The player is given a
* default throw.
*/


	public void assignName(String name){		//method for assigning the users name
		playerName = name;
	}

	public static  String getName(){		//static string of the players name
		return playerName;	
	}

	public RPSPlayer() {
		playerThrow = 1; //default throw 
	}

/**
* Sets the player's throw.
* pre: newThrow is the integer 1, 2, or 3.
* post: Player's throw has been made.
*/

	public void makeThrow(int newThrow){		//sets playerThrow as the value passed in
		playerThrow = newThrow;
}

/**
* Returns the player's throw.
* pre: none
* post: Player's throw has been returned.
*/

	public int getThrow() {
		return(playerThrow);		//returns the value as an int
	}
}

