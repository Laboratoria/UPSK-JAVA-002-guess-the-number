import java.util.Random;
public class ComputerPlayer extends Player {
    private static Random random = new Random();
    public ComputerPlayer(String name) {
        super(name);
    }
    @Override
    public Integer makeGuess() {
        int playerGuess = random.nextInt(100);
        guesses.add(playerGuess);
        return playerGuess;
    }
}
