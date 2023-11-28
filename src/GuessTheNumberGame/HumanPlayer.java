package GuessTheNumberGame;

import java.util.Scanner; // Import the Scanner class
public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }
    @Override
    public Integer makeGuess() {
        Scanner guessScanner = new Scanner(System.in);
        System.out.println(super.name + ", type a number between 1 and 100:");
        Integer playerGuess = guessScanner.nextInt();
        guesses.add(playerGuess);
        return playerGuess;
    }
}
