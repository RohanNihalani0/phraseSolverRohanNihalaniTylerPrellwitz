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
    Player player1 = new Player(); // calls Player constructor with no parameters, allows player to set their own name
    Player player2 = new Player(); // calls Player for player 2 with no parameters, allows player to set their own name
    Board board = new Board(); // initializes board to board class
    boolean solved = false; // sets solved to false to start the game
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

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}
