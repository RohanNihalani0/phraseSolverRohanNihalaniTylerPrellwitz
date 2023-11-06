/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    player1 = new Player(); // calls Player constructor with no parameters, allows player to set their own name
    player2 = new Player(); // calls Player for player 2 with no parameters, allows player to set their own name
    board = new Board(); // initializes board to board class
    solved = false; // sets solved to false to start the game
  }
  /* your code here - accessor(s) */
  public Player getPlayer1() { 
    return player1;
  }

  public Player getPlayer2() {
    return player2;
  }
  
  /* your code here - mutator(s)  */

  public void play()
  {

    boolean solved = false;
    int currentPlayer = 1;
    String currentPlayerName = player1.getName();

    Scanner input = new Scanner(System.in);

    String output = "";
      String phrase = board.getPhrase();
      for(int i = 0; i<phrase.length(); i++) {
        if(phrase.substring(i, i+1).equals(" ")) {
          output+= " ";
        } else {
          output+= "_";
        }
      }
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      

      System.out.println(output);

      System.out.println("Enter a guess or phrase Player " + currentPlayer);
      String playerGuess = input.nextLine();
      if(playerGuess.length() == 1) {
        if(board.guessLetter(playerGuess)) {
          System.out.println("You guessed the letter correctly");

          // code to display rest of phrase with new letter selected
          for(int n = 0; n<phrase.length(); n++) {
            if(phrase.substring(n, n+1).equals(playerGuess)) {
              output = output.substring(0, n) + playerGuess + output.substring(n+1, phrase.length());
            }
          }


        } else {
          if(currentPlayer == 1) {
            currentPlayer = 2;
            currentPlayerName = player2.getName();
          } else {
            currentPlayer = 1;
            currentPlayerName = player1.getName();
          }
          System.out.println("That letter is not in the phrase, it is now " + currentPlayerName + "'s turn." );
        }
      } else if(board.isSolved(playerGuess)) {
        System.out.println(currentPlayerName + " WINS!!!!!");
        solved = true;
      } else {
        System.out.println("YOU GUESSED THE PHRASE WRONG SO " + currentPlayerName + " LOSES" );
      }
    
      
      /* your code here - determine how game ends */
      
    } 
   
  }
  
}
