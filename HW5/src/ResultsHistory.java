package my.rps;

import java.util.ArrayList;

/**
 *	Field Summary:
 *		ArrayList<Result> results --
 *			Dynamic data structure to store individual results which 
 *			document the detailed history of a single match.
 *
 *	Constructor Summary:
 *		ResultsHistory() --
 *			Constructs an Array List of result objects.
 *		
 *	Method Summary:
 *		 void addResult () --
 *			Adds a Result object to the ResultsHistory.  This is done 
 *			after each round.
 *	
 * 	void getResults
 *	 returns Array List with result objects.
 *
 *  Primary Author: DM
 */

public class ResultsHistory {
	private ArrayList<Result> rHistory; 

        
	public ResultsHistory(){
	rHistory = new ArrayList<Result>();
	}

	
	public void addResult(Result r){
		rHistory.add(r);
	}
	
	public ArrayList<Result> getResults(){
		return rHistory;
	}
        
        public int getCurrentUserScore () {
            
            String player = "player";
            int playerTally = 0;
            int roundCounter = 1;
            ArrayList<Result> rHistory = new ArrayList<Result>();
            rHistory = getResults();
            
            for(Result r: rHistory){
                
                if(r.getWinner().equalsIgnoreCase(player))
                    playerTally++;

                roundCounter++;
            }
            
            return playerTally;
        }
        
        public int getCurrentComputerScore () {
            String comp = "Computer";
            int compTally = 0;
            int roundCounter = 1;
            
            for(Result r: rHistory){
                
                if(r.getWinner().equalsIgnoreCase(comp))
                    compTally++;

                roundCounter++;
            }
            
            return compTally;
            
        }
        
        public int getCurrentTies () {
            String comp = "Computer";
            int tieTally = 0;
            int roundCounter = 1;
            
            for(Result r: rHistory){
                if(r.getPlayerGesture().equals(r.getCompGesture()))
                    tieTally++;
                roundCounter++;
            }
            
            return tieTally;
            
        }
        
        public String getMatchResults(){
            
            String fullResults = "";
            
		int playerTally = 0;
		int compTally = 0;
		String comp = "Computer";
		String player = "player";
		int roundCounter = 1;
		ArrayList<Result> rHistory = new ArrayList<Result>();
		rHistory = getResults();
		
     
    
		for(Result r: rHistory){
			fullResults += ("Round " + roundCounter + "\n");
                        
                        fullResults +=  ("The Player's gesture was "+ r.getPlayerGesture() + "\n");
			fullResults += ("The Computer's gesture was " + r.getCompGesture() + "\n");
			
                        if(r.getPlayerGesture().equals(r.getCompGesture()))
				fullResults += ("The match was a tie!" + "\n");
			else
			fullResults += ("The winner for this round is " +r.getWinner()  + "!" + "\n");
			fullResults += ("\n");
			

			
			if(r.getWinner().equalsIgnoreCase(comp))        
				compTally++;
			else if(r.getWinner().equalsIgnoreCase(player))
				playerTally++;
			
			roundCounter++;
		}
		
		String winner = "";
		if (compTally> playerTally)
			winner = "Computer";
		else if(playerTally >compTally)
			winner = "Player";
		if(compTally == playerTally)
			fullResults += ("The match was a tie!" + "\n");
		else {
			fullResults += ("Player tally: " +playerTally +" Comp tally: " +compTally + "\n"); 
      fullResults += ("The overall winner for the match is the " + winner + "!!!!!" + "\n");
		}
                
                return fullResults;
	}
        
        
        
}
