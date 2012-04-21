package my.rps;

/**
 *	Field Summary:
 *		String winner --
 *			Stores a copy of the Player.Name field indicating who won
 *			the individual round.
 *		Gesture playerGesture : stores player's Gesture.
 *		Gesture compGesture :  store player's Gesture.
 *
 *	Constructor Summary:
 *		Result (String, Gesture, Gesture) --
 *			Takes a string indicating the name of the winner.  Becomes
 *			the "default" constructor, and works as the mutator for
 *			the Result class.
 *			Also takes two Gesture representing player and computer's Gestures.
 *
 *	Method Summary:
 *		String getWinner () --
 *			Returns the name of the winner of the round.
 *		Gesture getPlayerGesture()
 *			returns player's Gesture.
 *		Gesture getCompGesture
 *			returns computer's gesture.
 *
 *  Primary Author: DM
 *
 */
public class Result {
	
	private String winner;
	private Gesture playerGesture;
	private Gesture compGesture;
	String rock ="Rock";
	String paper = "Paper";
	String scissors = "Scissors";
	
	public Result(String w, Gesture comp, Gesture player ){
		winner = w;
		playerGesture = player;
		compGesture = comp;
	}
	
	public String getWinner(){
		return winner;
	}
	
	public String getPlayerGesture(){
		if (playerGesture.getGesture() == 0) 
			return rock;
		else if(playerGesture.getGesture() == 1)
			return paper;
		else if(playerGesture.getGesture() == 2)
			return scissors;
		return null;
	}
	
	public String getCompGesture(){
		if (compGesture.getGesture() == 0) 
			return rock;
		else if(compGesture.getGesture() == 1)
			return paper;
		else if(compGesture.getGesture() == 2)
			return scissors;
		return null;
	}
	
}
