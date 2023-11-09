// EX04_TAU_TambabaAV
package ex04_tau_tambabaav;
import java.util.Scanner;
public class EX04_TAU_TambabaAV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");
        
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
        
        int roundsToWin = 2;
        
        while(true){
            System.out.println("Let's play Rock, Paper, Scissors! Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
        
            String playerChoice = input.nextLine();
            if("1".equals(playerChoice)){
                int playerScore = 0;
                int compScore = 0;
                
                while(roundsToWin > compScore && roundsToWin > compScore){
                    Move playerMove, compMove;
                    String winner;
                    
                    System.out.println("\n----- \n\nLet's play! First to " + roundsToWin + " wins.");
                    System.out.println("Player (you): " + playerScore + " - Computer: " + compScore);
                    
                    System.out.println("\nThe computer has selected its move. Please select your move:");
                    System.out.println("1. Rock\n2. Paper\n3. Scissors");
                    
                    String playerInput = input.nextLine();
                    playerMove = switch (playerInput) {
                        case "1" -> rock;
                        case "2" -> paper;
                        case "3" -> scissors;
                        default -> null;
                    };
                    
                    int compInput = (int) Math.floor(Math.random()*3) + 1;
                    compMove = switch (compInput) {
                        case 1 -> rock;
                        case 2 -> paper;
                        case 3 -> scissors;
                        default -> null;
                    };
                    
                    if(playerMove != null){
                        int roundWinner = Move.compareMoves(playerMove, compMove);
                        switch (roundWinner) {
                            case 0 -> {
                                winner = "Player";
                                System.out.println("\nPlayer chose " + playerMove.getName() + ". Computer chose " + compMove.getName() + ".");
                                System.out.println(winner + " wins the round!");
                                playerScore++;
                            }
                            case 1 -> {
                                winner = "Computer";
                                System.out.println("\nPlayer chose " + playerMove.getName() + ". Computer chose " + compMove.getName() + ".");
                                System.out.println(winner + " wins the round!");
                                compScore++;
                            }
                            case 2 -> {
                                winner = "Tied";
                                System.out.println("\nPlayer chose " + playerMove.getName() + ". Computer chose " + compMove.getName() + ".");
                                System.out.println(winner + "! Both players chose the same move.");
                            }
                            default -> winner = null;
                        }

                        if((playerScore == roundsToWin || compScore == roundsToWin) && playerScore > compScore){
                            System.out.println("\nPlayer (you): " + playerScore + " - Computer: " + compScore);
                            System.out.println("Player wins the game!\n\n-----\n");
                            break;
                        }

                        else if((playerScore == roundsToWin || compScore == roundsToWin) && compScore > playerScore){
                            System.out.println("\nPlayer (you): " + playerScore + " - Computer: " + compScore);
                            System.out.println("Computer wins the game!\n\n-----\n");
                            break;
                        }
                    }
                    
                    else { System.out.println("\nInvalid input. Please input a valid option!"); }
                }
            }
            
            else if("2".equals(playerChoice)){
                System.out.println("\nHow many wins are needed to win a match?");
                
                int userChoice = input.nextInt(); input.nextLine();
                if(userChoice > 0){
                    roundsToWin = userChoice;
                }
                
                System.out.println("\nNew settings saved.\n\n-----\n");
            }
            
            else if("3".equals(playerChoice)){
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
            
            else { System.out.println("Invalid input. Please put a valid option!\n\n-----\n"); }
        }
    }
}