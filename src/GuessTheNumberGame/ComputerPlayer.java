package GuessTheNumberGame;

import java.util.Random;
public class ComputerPlayer extends Player {
    Random random = new Random();
    public ComputerPlayer(String name) {
        super(name);
    }
    @Override
    public Integer makeGuess() {
        int playerGuess = random.nextInt(100);
        System.out.println("GuessTheNumberGame.Player 2 guess: " + playerGuess);
        guesses.add(playerGuess);
        return playerGuess;
    }
}
