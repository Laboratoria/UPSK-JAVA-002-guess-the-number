import java.util.Scanner; // Import the Scanner class
public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }
    @Override
    public Integer makeGuess() {
        Scanner inputUserName = new Scanner(System.in); // Create a Scanner object

        System.out.println("Let`s play! Please, type your name:");
        this.name = inputUserName.nextLine(); // Read user input

        Scanner guessScanner = new Scanner(System.in);
        System.out.println("Hello, "+ this.name + "!" + " Please, type a number between 1 and 100:");
        Integer playerGuess = guessScanner.nextInt();
        guesses.add(playerGuess);
        return playerGuess;
    }
}
