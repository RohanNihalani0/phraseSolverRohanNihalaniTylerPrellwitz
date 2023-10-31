/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */

  /* your code here - constructor(s) */ 
  public Player() {
    System.out.println("Enter Player Name:");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();
    String name = newName;
    System.out.println("Hello and welcome to the game, " + name);
    int points = 0;
  }

  public Player(String inputName) {
    String name = inputName;
    int points = 0;
    System.out.println("Welcome " + name);
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}