/**
 *  A class that models the game of Lucky Sevens. 
 *  
 *  @author: Arnav Garg, Samuel Xiang, Sebastian Marrufo
 *  @AP Computer Science A, Virtual Virginia
 */

public class LuckySevens
{
    private int balance;
    private int numOfTurns;
    
    private int numSevenRolls;   //Number of turns that rolled a seven
    private int maxBalance;      //Maximum balance of the player
    private int maxBalanceTurn;  //Turn at which the player had the max balance
   
    public LuckySevens(int userBalance){
        // initialize the fields aka private instance variables
        // init balance
        // init numOfTurns
        
        balance = userBalance;
        numOfTurns = 0;
    }
    
    public int rollDie(){
        // pick a random number between 1 and 6
        int num = (int) (Math.random() * 6) + 1;
        return num;
    }
    
    public void playTurn(){
        int die1 = rollDie();
        int die2 = rollDie();
        
        if(die1 + die2 == 7){
            balance += 4; //Add 4 to the balance if the sum is 7
            numSevenRolls++; //Increment the counter of seven rolls
        } else {
            balance--; //Decrement the balance by 1 otherwise
        }
        
        numOfTurns++; //Increment the turn counter

        if (balance > maxBalance) {
            maxBalance = balance;
            maxBalanceTurn = numOfTurns;
        }
    }
    
    public void playGame(){
        while (balance > 0) {
            playTurn(); //Loop and call playTurn until we are out of money 
        }
        
        System.out.println(getGameReport()); //Once the loop is over, print the game report.
    }
    
    public String getGameReport() {
        double percentSevens = (double) numSevenRolls / numOfTurns * 100.0;
        return "You lasted a whopping " + numOfTurns + " rounds.  " 
        + (int) percentSevens + "% of your rolls were sevens.  " +
        "You had the most money at turn " + maxBalanceTurn + " with " + maxBalance + " dollars.";
    }
}
