/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) */ 
  public Player() { // constructor with no params
    System.out.println("Enter Player Name:"); // prompts user to enter their name
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();
    name = newName; // sets name to what they enter
    System.out.println("Hello and welcome to the game, " + name); // prints welcome
    points = 0; // sets points to start at 0
  }

  public Player(String inputName) {
    name = inputName; // sets name to whatever parameter is passed in
    points = 0; // starts points at 0
    System.out.println("Welcome " + name); // prints welcome statement
  }
  /* your code here - accessor(s) */ 
  public String getName() {
    return name; // returns player name
  }

  public int getPoints() {
    return points; // returns player points
  }
  /* your code here - mutator(s) */ 
}
