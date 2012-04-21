package my.rps;

/**
 *	Field Summary:
 *    String name --
 *			A unique identifier for each player.  Name is used when displaying
 *			results so that application user can differentiate between the 
 *			different players.
 *
 *	Constructor Summary:
 *		Default constructor.
 *
 *	Method Summary:
 *		Gesture getPlayerGesteure () -- 
 *			Handles the process of getting a gesture from the user.  The 
 *			selected gesture should be returned to the judge to determine
 *			the winner of the round.
 *		void displayGesturePrompt() --
 *			Display an on-screen message asking the user to provide a gesture
 *			selection.
 *		Gesture readGesture () --
 *			Read the user's gesture selection in and set it
 *
 *  Primary Author: MS
 */
 
public class User implements Player {

  private String name;
  private Gesture gesture;
  
  // Constructor
  public User () { name = "User"; }
  
  public User (char userSelection) { //p5
      name = "User";
      gesture = new Gesture(userSelection);
  }
      
  // Methods
  
    @Override
 public Gesture getPlayerGesture () { return gesture; } //p5
  
  
}