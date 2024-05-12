import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.print("Choose[r]ock, [p]aper or [s]cissors: ");
        Scanner scan=new Scanner(System.in);
        String playerMove=scan.nextLine();
        if (playerMove.equals("r")|| playerMove.equals("rock")){
            playerMove=ROCK;
        }else if (playerMove.equals("p")||playerMove.equals("paper")){
            playerMove=PAPER;
        }else if (playerMove.equals("s")||playerMove.equals("scissors")){
            playerMove=SCISSORS;
        }else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        Random random=new Random();
        int computerRandomNumber= random.nextInt(4);
        String computerMove="";
        switch(computerRandomNumber){
            case 1:
                computerMove=ROCK;
                System.out.println("The computer chose "+computerMove+".");
                break;
            case 2:
                computerMove=PAPER;
                System.out.println("The computer chose "+computerMove+".");
                break;
            case 3:
                computerMove=SCISSORS;
                System.out.println("The computer chose "+computerMove+".");
                break;
        }
        if((playerMove.equals("Rock")&&computerMove.equals("Scissors"))||
                (playerMove.equals("Paper")&&computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors")&&computerMove.equals("Paper"))){
            System.out.println("You win.");
        }else if ((computerMove.equals("Rock")&&playerMove.equals("Scissors"))||
                (computerMove.equals("Scissors")&&playerMove.equals("Paper"))||
                computerMove.equals("Paper")&&playerMove.equals("Rock")){
            System.out.println("You lose.");
        }else{
            System.out.println("The game is a draw.");
        }
        }
    private static final String ROCK="Rock";
    private static final String PAPER="Paper";
    private static final String SCISSORS="Scissors";
    }