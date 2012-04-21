package my.rps;

/**
 *	Field Summary:
 *		User human --
 *			User object that is used whenever an interaction occurs with the
 *			human player.
 *		Computer cpu --
 *			Computer object that is used whenever an interaction occurs with 
 *			the computer player.
 *		Referee judge --
 *			Referee object that is used to determine the outcome of a round.  
 *			
 *	Constructor Summary:
 *		Round () --
 *			Default constructor to initialize member fields.
 *
 *	Method Summary:
 *		Result playRound () --
 *			Implements the process of playing a single round of RPS.  Returns
 *			a Result object to Match so that it can be added to the 
 *     	ResultsHistory structure.
 *
 *  Primary Author: MS
 *
 */
public class Round {
	// Class fields
	private User human;
	private Computer cpu;
	private Referee judge;
	
	// Consturctor
  public Round (String difficulty, char userGesture)
  {
    human = new User(userGesture);
    cpu = new Computer("CPU", difficulty);
    judge = new Referee ();
  }
  
    public Result playRound()
  {
    //System.out.println("");
    //System.out.println("****PLAYING A ROUND!*******");
    //System.out.println("");
    return judge.determineWinner( human.getPlayerGesture(), 
                                  cpu.getPlayerGesture() );
    
  }
  
}