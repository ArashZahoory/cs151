package my.rps;

import java.util.ArrayList;
/**
 * Field Summary:
 * ResultsHistory history stores history of match
 * int roundsPerMatch stores the number of rounds chosen
 * 
 *  Constructor Summary:
 *  Constructor takes in number of rounds chosen by player.
 *  
 *  Method Summary:
 *  
 *  void playMatch
 *  plays a match with number of rounds chosen and stores each 
 *  round's results in history.
 *  
 *  void displayResults
 *  displays entire result history of the match,
 *  including each gesture.
 * 	Also determines overall winner of match with tally.
 * 
 *  Primary Author: DM
 */

public class Match {
	//public static ResultsHistory history = new ResultsHistory();
	private int roundsPerMatch;
	private int roundsPlayed;
        
        private String difficulty;
        
	public Match(int rounds, String difficulty){
		roundsPerMatch = rounds;
                this.difficulty = difficulty;
                roundsPlayed = 0;
	}
	
	public String getDifficulty () { return difficulty; }	
	
        public void playMatch(char userGesture, ResultsHistory history){ // p5
            
            // Play a single round
            Round rnd = new Round( difficulty, userGesture ); //p5
            history.addResult(rnd.playRound());
            roundsPlayed++; //p5
            
	}
	
        public boolean getMatchProgress () {
            
            if (roundsPerMatch == roundsPlayed) 
            {return true; }
            
            return false;
        }
        
        
        
	
        
	
}
