import java.util.Scanner;

public class LuckySevensRunner
{
    /*
    *   Call this method when you wish to simulate a game of Lucky Sevens. 
    */
    public static void main(String[] args) {

        // Create a Scanner object to handle user input
        Scanner input = new Scanner(System.in);
        
        // Print some text to the user
        System.out.println("Welcome to the Lucky Sevens Casino!");
        System.out.print("How much money are you willing to lose? ");
        
        // Use the Scanner object to read the user's integer input
        int userInput = input.nextInt();
        System.out.println("Say goodbye to your " + userInput + " dollars.");
        
        //Create a LuckySevens object
        LuckySevens userGame = new LuckySevens(userInput);
        
        // Call the playGame method on the LuckySevens object
        userGame.playGame();
    }

}