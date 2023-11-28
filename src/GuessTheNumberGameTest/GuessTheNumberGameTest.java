package GuessTheNumberGameTest;
import GuessTheNumberGame.GuessTheNumberGame;
import GuessTheNumberGame.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class GuessTheNumberGameTest {
    @Test
    @DisplayName("Should return message warning the guess is too low")
    void testCheckGuessTooLow() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);

        when(mockPlayer.makeGuess()).thenReturn(10);
        game.targetNumber = 100;
        int guess = game.checkGuess(mockPlayer);
        assertEquals(10, guess);
    }
    @Test
    @DisplayName("Should return message warning the guess is too high")
    void testCheckGuessTooHigh() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);

        when(mockPlayer.makeGuess()).thenReturn(50);
        game.targetNumber = 10;
        int guess = game.checkGuess(mockPlayer);
        assertEquals(50, guess);
    }
    @Test
    @DisplayName("Should return message warning the guess is correct")
    void testCheckGuessCorrect() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);

        when(mockPlayer.makeGuess()).thenReturn(50);
        game.targetNumber = 50;
        int guess = game.checkGuess(mockPlayer);
        assertEquals(50, guess);
    }
}