/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */

  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    Player player1 = new Player();
    Player player2 = new Player();
    Board board = new Board();
    boolean solved = false;
  }
  /* your code here - accessor(s) */
  
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