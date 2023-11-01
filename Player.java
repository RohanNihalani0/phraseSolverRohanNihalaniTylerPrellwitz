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
  public Player() { // constructor with no params
    System.out.println("Enter Player Name:"); // prompts user to enter their name
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();
    String name = newName; // sets name to what they enter
    System.out.println("Hello and welcome to the game, " + name); // prints welcome
    int points = 0; // sets points to start at 0
  }

  public Player(String inputName) {
    String name = inputName; // sets name to whatever parameter is passed in
    int points = 0; // starts points at 0
    System.out.println("Welcome " + name); // prints welcome statement
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}
