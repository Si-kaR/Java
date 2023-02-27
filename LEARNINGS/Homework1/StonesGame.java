import java.util.Scanner;

public class StonesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask for starting number of stones
        System.out.print("Enter the starting number of stones: ");
        int numStones = sc.nextInt();

        // validate input
        while (numStones <= 0 || numStones % 2 == 0) {
            System.out.println("Invalid input. Please enter a positive odd number.");
            System.out.print("Enter the starting number of stones: ");
            numStones = sc.nextInt();
        }

        // ask for player names
        System.out.print("Enter the name of player 1: ");
        String player1 = sc.next();
        System.out.print("Enter the name of player 2: ");
        String player2 = sc.next();

        // initialize variables for number of stones for each player and stones left in pile
        int player1Stones = 0;
        int player2Stones = 0;
        int stonesLeft = numStones;

        // initialize variable to keep track of whose turn it is
        boolean player1Turn = true;

        while (stonesLeft > 0) {
            // get current player's name
            String currentPlayer = player1Turn ? player1 : player2;
            System.out.printf("%s, choose between 1 and ", currentPlayer);
            int maxStones = player1Turn ? numStones/2 : player1Turn ? player1Stones*2 : player2Stones*2;
            maxStones = Math.min(maxStones, stonesLeft);
            System.out.printf("%d stones: ", maxStones);
            int stonesPicked = sc.nextInt();

            // validate input
            while (stonesPicked < 1 || stonesPicked > maxStones) {
                System.out.println("Invalid input. Please enter a valid number of stones.");
                System.out.printf("%s, choose between 1 and %d stones: ", currentPlayer, maxStones);
                stonesPicked = sc.nextInt();
            }

            // update number of stones for current player and stones left in pile
            if (player1Turn) {
                player1Stones += stonesPicked;
            } else {
                player2Stones += stonesPicked;
            }
            stonesLeft -= stonesPicked;

            // display summary
            System.out.printf("%s (Player 1) has %d stones.\n", player1, player1Stones);
            System.out.printf("%s (Player 2) has %d stones.\n", player2, player2Stones);
            System.out.printf("There are %d stones left in the pile\n", stonesLeft);

            // switch to other player's turn
            player1Turn = !player1Turn;
        }

        // announce winner
        if (player1Stones % 2 == 1) {
            System.out.println(player1 + " wins!");
        } else {
            System.out.println(player2 + " wins!");
        }
    }
}
