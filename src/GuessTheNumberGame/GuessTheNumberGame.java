package GuessTheNumberGame;

import java.util.Random; // import the Random class
import java.util.Scanner;

public class GuessTheNumberGame {
    public static int targetNumber;
    public static void main(String[] args) {
        Random random = new Random(); //instance an object from class Random
        targetNumber = random.nextInt(100); //generate a random value from type int
        Scanner inputUserName = new Scanner(System.in); // Create a Scanner object
        System.out.println("Let`s play! Please, type your name:");
        String playerName = inputUserName.nextLine(); // Read user input
        Player humanPlayer = new HumanPlayer(playerName);
        Player computerPlayer = new ComputerPlayer("GuessTheNumberGame.Player 2");

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
    public static int checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess < targetNumber) {
            System.out.println("The guess " + guess + " is too low");
        } else if (guess > targetNumber) {
            System.out.println("The guess " + guess + " is too high");
        } else {
            player.setGuessed(true);
        }
        return guess;
    }
    public static void displayGameResult(Player winner) {
        System.out.println(targetNumber + " is correct, " + winner.getName() + " wins!");
        System.out.println(winner.getName() + " guesses: " + winner.getGuesses());
    }
}