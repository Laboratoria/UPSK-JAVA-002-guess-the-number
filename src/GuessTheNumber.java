import java.util.Random; // import the Random class
public class GuessTheNumber {
    private static Random random = new Random(); //instance an object from class Random
    private static int targetNumber;
    public static void main(String[] args) {
        targetNumber = random.nextInt(100); //generate a random value from type int
        Player humanPlayer = new HumanPlayer("Player 1");
        Player computerPlayer = new ComputerPlayer("Player 2");

        Player currentPlayer = humanPlayer;
        while (true) {
            checkGuess(currentPlayer);
            if(currentPlayer.hasGuessed()) {
                displayGameResult(currentPlayer);
                break;
            }
            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
        }
    }
    public static void checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess < targetNumber) {
            System.out.println("The guess " + guess + " is too low");
        } else if (guess > targetNumber) {
            System.out.println("The guess " + guess + " is too high");
        } else {
            player.setGuessed(true);
        }
    }

    public static void displayGameResult(Player winner) {
        System.out.println(targetNumber + " is correct, " + winner.getName() + " wins!");
        System.out.println(winner.getName() + "guesses: " + winner.getGuesses());
    }
}