package ph.edu.dlsu.lbycpob.hangman.model;
import ph.edu.dlsu.lbycpob.hangman.statistics.GameStatistics;
import java.io.Serializable;

public class GameState implements Serializable {
   private static final long serialVersionUID = 1L;

   /**
    * The word list file currently in use (e.g. {@code "words.txt"}).
    */
   private String filename = "";

   /**
    * Upper-cased secret word for the current round.
    */
   private String secretWord = "";

   /**
    * Concatenated string of every letter the player has guessed so far,
    * in the order they were guessed – mirrors the {@code guessedLetters}
    * local variable from the original {@code playOneGame}.
    */
   private String guessedLetters = "";

   /**
    * How many incorrect guesses the player still has available.
    */
   private int guessesRemaining = 8;

   /**
    * Accumulated statistics across all games in this browser session –
    * the immutable {@link GameStatistics} record is replaced on each
    * game completion via {@link GameStatistics#withGame}.
    */
   private GameStatistics statistics = GameStatistics.empty();

   /**
    * The feedback message shown at the top of the play page.
    */
   private String message = "";

   /**
    * {@code true} once the round has been won or lost.
    */
   private boolean gameOver = false;

   /**
    * {@code true} if the player guessed all letters before running out.
    */
   private boolean won = false;

