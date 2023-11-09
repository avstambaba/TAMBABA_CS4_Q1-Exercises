package ex04_tau_tambabaav;
public class RockPaperScissors{
    public static void main(String[] args){
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
		
	int roundsToWin = 2;
    }
}