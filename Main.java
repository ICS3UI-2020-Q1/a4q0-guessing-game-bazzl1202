import java.util.Scanner;
import java.util.Random;
/**
 * A number guessing game
 * @author Liana Bazzarella 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scannner for user input
    Scanner input = new Scanner(System.in);
    // creating the random generator
    Random rand = new Random();

    // create a random number
    int randomNumber = rand.nextInt(100) + 1;

    // delare the guess variable
    int guess;
    // game loop
    do{
     // asl the user for their guess
     System.out.println("Please enter a number between 1 and 100");
     guess = input.nextInt();
     // is it to high or is it to low?
     if(guess > randomNumber){
       System.out.println("Too high");
     }else if(guess < randomNumber){
       System.out.println("Too low");
    }
    
    }while(guess != randomNumber);
    System.out.println("Congratulations! You win");
  }
}
