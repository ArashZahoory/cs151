package my.rps;

/**
 *	Field Summary:
 *		String name --
 *			A unique identifier for each player.  Name is used when displaying
 *			results so that application user can differentiate between the 
 *			different players.
 *	
 *	Constructor Summary:
 *		Player () --
 *			REMOVED BECAUSE INTERFACE FIELDS ARE IMMUTABLE!
 *	Method Summary:
 *		Gesture getPlayerGesture --
 *			Method to be implemented by the subclasses of Player.  Carries out
 *			the process needed for each type of player to provide a gesture. 
 * 
 *  Primary Author: MS
 */

public interface Player {
	
	// Method prototypes
	public Gesture getPlayerGesture();
}