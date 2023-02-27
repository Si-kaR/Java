import java.util.Scanner;

//Creating Class
public class stoneGame{

    public static void main(String[] args){
        //Prompting the users to enter the starting number of stones
        System.out.println(String.format("\nHello there,\nEnter the number of stones for this round\n(Your number should be a positive and odd number only: )"));

        //Creating scanner object for collecting input
        Scanner keyboard_Inputs = new Scanner(System.in);

        //Initialising number of stones, initial number of stones for each player,
        int initialStones, stonesPlayer1 = 0, stonesPlayer2 = 0, remainingStones = 0, playNum = 0;

        //Initialising name of players
        String player1Name, player2Name;

        //Actually collecting the inputs you being asked for
        initialStones = input.nextInt();
        //Creating a condition to check for the odd and positive input.
        //If input is anything otherthan odd or positive, the user will be prompted again to give the values
        while (initialStones <= 0 || initialStones % 2 == 0) {
            System.out.println("Your were asked to input odd and positive values\nEnter an odd and positive value else you won't play this game");
            //Actually collecting the inputs you being asked for
            initialStones = input.nextInt();
        }
        //Creating relation between the initialStones and remainingStones
        remainingStones = initialStones;

    }

}