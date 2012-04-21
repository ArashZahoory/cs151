package my.rps;

/**
 *	Field Summary:
 *    String name --
 *			A unique identifier for each player.  Name is used when displaying
 *			results so that application user can differentiate between the 
 *			different players.
 *		GameIntelligence ai --
 *			Object that provides Computer access to the AI needed for 
 *			selecting a gesture durnig a round.
 *
 *	Constructor Summary:
 *		Computer () --
 *			Default constructor that initializes member fields	
 *	
 *	Method Summary:
 *		Gesture getPlayerGesture () --
 *			Gets gesture from Computer player.  This will include 
 *			running the gesture selection algorithm implemented in
 *			the GameIntelligence class.		 
 *
 *  Primary Author: MS
 *
 */
public class Computer implements Player {
	// Class fields
  private String name;
	private GameIntelligence ai;
	
  // Constructors
  public Computer (String name, String difficulty)
  { 
    this.name = name;
    ai = GameIntelligence.initialize(difficulty);
  }
	
	public Gesture getPlayerGesture() {
		return ai.getGesture();
	}
}