import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // getting the move from the player using scanner
        Scanner scanner = new Scanner(System.in);

// while loop
        while(true) {

            // randomised computer input - creating a list that the computer chooses from
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove;
            // making sure the player uses only rps
            while (true) {
                System.out.println("Please enter your move (r, p, s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }
            System.out.println("Computer played " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");

                // if the player plays rock - paper beats rock and rock beats scissors
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            }

            // if the player plays paper - scissors beats paper and rock beats paper
            else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You win!");
                }
            }
            // if the player plays scissors - rock beats scissors and scissors beats paper
            else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win!");
                }
            }
            // within the while loop to ask user if they want to play again
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")){
                break;
            }
        }
        // closing the scanner
        scanner.close();
    }
}