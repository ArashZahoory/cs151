package my.rps;

/**
 *	Field Summary:
 *		<NONE>
 *	
 *	Constructor Summary:
 *		Default constructor.
 *	
 *	Method Summary:
 *		Result determineWinner (Gesture, Gesture) --
 *			Method responsible for determining the winner of a match.
 *			Methods takes in two gestures, determines the winner, 
 *			writes the result to a Result object, and then returns
 *			the Result object to the Match object so it can be written to
 *			the ResultsHistory.
 *
 *  Original Author: CF
 *  Updated: DM
 *
 */
public class Referee {
	// Fields
	
	// Method Prototypes
	public Result determineWinner(Gesture play, Gesture comp){//alter result instantiation
		if(comp.getGesture() == play.getGesture()){
			return new Result("tie", comp, play);
		}else if(comp.getGesture()==0 && play.getGesture()==2){//rock vs. scissors
			return new Result("computer", comp, play);
		}else if(comp.getGesture()==1 && play.getGesture() ==2){
			return new Result("player", comp, play);
		}else if(comp.getGesture()==2 && play.getGesture() ==1){
			return new Result("computer", comp, play);
		}else if(comp.getGesture()==0 && play.getGesture() ==1){
			return new Result("player", comp, play);
		}else if(comp.getGesture()==1 && play.getGesture() ==0){
			return new Result("computer", comp, play);
		}else if(comp.getGesture()==2 && play.getGesture() ==0){
			return new Result("player", comp, play);
		}
		return null;
	}
}