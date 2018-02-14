import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        int gameNumber = 1;
        int firstCard = 5; // use random to generate value for firstCard
        int heldHand = 0;
        int option = 0;
        int anotherCard;
        int playerWins = 0;
        int dealerWins = 0;
        int gameTies = 0;
        int dealerCard;
        int hitHand = 0;
        boolean firstRound = true;
        boolean menuFour = false;
        boolean endGame = false;

        while (!menuFour) { // while loop needs to be introduced to keep the game running
            // use option #4 exit to shut down game


            while (firstRound == true) {

                System.out.println("START GAME #1");
                System.out.println();
                firstCard = randGen.nextInt(13) + 1; // assign card value from 1-13
                // deal first card

                //print card value
                if (firstCard == 1) {
                    System.out.println("Your card is a ACE!");
                } else if (firstCard <= 10) {
                    System.out.println("Your card is a " + firstCard + "!");
                } else if (firstCard == 11) {
                    System.out.println("Your card is a JACK!");
                } else if (firstCard == 12) {
                    System.out.println("Your card is a QUEEN!");
                } else if (firstCard == 13) {
                    System.out.println("Your card is a KING!");
                    //firstCard = 1; // so KING registers as 10 when added to player's hand
                }

                System.out.println("Your hand is: " + firstCard);
                System.out.println();

                firstRound = false;
            }
            System.out.println(firstCard);

            // print menu options
            System.out.println();
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print game statistics");
            System.out.println("4. Exit");
            System.out.println();

            //tie menu options to scanner input
            System.out.print("Choose an option: ");
            option = scnr.nextInt();
            System.out.println();


            anotherCard = randGen.nextInt(13) + 1;
            // link them to their function
            if (option == 1) { // get another card

                if (anotherCard == 1) {
                    System.out.println("Your card is a ACE!");
                } else if (anotherCard <= 10) {
                    System.out.println("Your card is a " + anotherCard + "!");
                } else if (anotherCard == 11) {
                    System.out.println("Your card is a JACK!");
                } else if (anotherCard == 12) {
                    System.out.println("Your card is a QUEEN!");
                } else if (anotherCard == 13) {
                    System.out.println("Your card is a KING!");
                    //firstCard = 1; // so KING registers as 10 when added to player's hand
                }

                // System.out.println(anotherCard); for testing
                hitHand = heldHand + anotherCard + firstCard;
                System.out.println("Your hand is: " + hitHand);
                System.out.println();

                if (hitHand == 21) {
                    System.out.println("BLACKJACK! You win!");
                    playerWins += 1;
                    endGame = true;
                } else if (hitHand > 21) {
                    System.out.println("You exceeded 21! You lose.");
                    dealerWins += 1;
                    endGame = true;
                }
                if (endGame == true) {
                    gameNumber += 1;
                    System.out.println();
                    System.out.println("START GAME #" + gameNumber);
                }
            } else if (option == 2) {
                // hold hand
                heldHand = hitHand + firstCard;
                dealerCard = randGen.nextInt(11) + 16;
                System.out.println("Dealer's hand: " + dealerCard);
                System.out.println("Your hand is: " + heldHand);
                System.out.println();
                if (dealerCard > 21) {
                    System.out.println("You win!");
                    playerWins += 1;
                    endGame = true;
                } else if (dealerCard == heldHand) {
                    System.out.println("It's a tie! No one wins!");
                    gameTies += 1;
                    endGame = true;
                } else if (dealerCard > heldHand) {
                    System.out.println("Dealer wins!");
                    dealerWins += 1;
                    endGame = true;
                } else if (heldHand > dealerCard) {
                    System.out.println("You win!");
                    playerWins += 1;
                    endGame = true;
                }
                if (endGame == true) {
                    gameNumber += 1;
                    System.out.println();
                    System.out.println("START GAME #" + gameNumber);
                }
            } else if (option == 3) {
                // print statistics
                System.out.println("Number of Player wins: " + playerWins);
                System.out.println("Number of Dealer wins: " + dealerWins);
                System.out.println("Number of tie games: " + gameTies);
                System.out.println("Total # of games played is: " + gameNumber);
                System.out.println("Percentage of player wins: " + (double) playerWins / (double) dealerWins + "%");
                System.out.println();
            } else if (option == 4) {
                menuFour = true;
            }
        }






    }
}

