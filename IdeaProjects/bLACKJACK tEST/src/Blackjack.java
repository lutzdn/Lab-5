// figure out how to isolate Start game from the process

import java.util.*;

public class Blackjack {
    public static void dealPlayerCard(int hitCard) {

        if (hitCard == 1) {
            System.out.println("Your card is a ACE!");
        } else if (hitCard <= 10) {
            System.out.println("Your card is a " + hitCard + "!");
        } else if (hitCard == 11) {
            System.out.println("Your card is a JACK!");
        } else if (hitCard == 12) {
            System.out.println("Your card is a QUEEN!");
        } else if (hitCard == 13) {
            System.out.println("Your card is a KING!");
        }
    }
//    public static void dealDealerCard(int dealerCard) {
//
//
//        if (dealerCard == 1) {
//            System.out.println("Your card is a ACE!");
//        } else if (dealerCard <= 10) {
//            System.out.println("Your card is a " + dealerCard + "!");
//        } else if (dealerCard == 11) {
//            System.out.println("Your card is a JACK!");
//        } else if (dealerCard == 12) {
//            System.out.println("Your card is a QUEEN!");
//        } else if (dealerCard == 13) {
//            System.out.println("Your card is a KING!");
//        }
//    }

    public static void printMenu() {


        // print menu options
        System.out.println();
        System.out.println("1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print statistics");
        System.out.println("4. Exit");
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        boolean isMenuFour = false;
        boolean gameOver = false;
        int gameNumber = 0;
        int yourHand = 0;
        int hitCard;
        int dealerCard;
        int option;
        int playerWins = 0;
        int dealerWins = 0;
        int gameTies = 0;

        if (isMenuFour) {
            System.exit(0);
        }

        gameNumber += 1;
        System.out.println("START GAME #" + gameNumber);
        System.out.println();
                                                                        // this section is only placed here so it happens automatically
        dealPlayerCard(hitCard = randGen.nextInt(13) + 1);      // at the beginning of each game
        yourHand += hitCard;
        System.out.println("Your hand is: " + yourHand);
        System.out.println();


        while (!isMenuFour) {


            if (gameOver) {
                gameNumber ++;
                yourHand = 0;

                System.out.println();
                System.out.println("START GAME #" + gameNumber);
                System.out.println();

                dealPlayerCard(hitCard = randGen.nextInt(13) + 1);      // at the beginning of each game
                yourHand += hitCard;
                System.out.println("Your hand is: " + yourHand);
                System.out.println();

                printMenu();
                System.out.print("Choose an option: ");
                System.out.println();
            }

            if (!gameOver) {
                printMenu();

                System.out.print("Choose an option: ");
                System.out.println();
            }

            option = scnr.nextInt();

            if (option == 1) {
                dealPlayerCard(hitCard = randGen.nextInt(13)+ 1);
                yourHand += hitCard;
                System.out.println("Your hand is: " + yourHand);

                if (yourHand == 21) {
                    System.out.println("BLACKJACK! You win!");
                    playerWins += 1;
                    gameOver = true;

                    // start new game
                } else if (yourHand > 21) {
                    System.out.println("You exceeded 21! You lose.");
                    dealerWins += 1;
                    gameOver = true;
                    // start new game
                }
                // all above is already existing
            } else if (option == 2) {
                //dealDealerCard(dealerCard = randGen.nextInt(11) + 16);
                dealerCard = randGen.nextInt(11) + 16;
                System.out.println();
                System.out.println("Dealer's hand: " + dealerCard);
                System.out.println("Your hand is: " + yourHand);
                System.out.println();

                if (dealerCard == yourHand) {
                    System.out.println("Its a tie! No one wins!");
                    gameTies ++;
                    gameOver = true;
                    // start new game
                } else if (dealerCard > 21) {
                    System.out.println("You win!");
                    playerWins ++;
                    // start new game
                    gameOver = true;
                } else if (dealerCard > yourHand) {
                    System.out.println("Dealer wins!");
                    dealerWins ++;
                    gameOver = true;
                } else if (yourHand > dealerCard) {
                    System.out.println("You win!");
                    gameOver = true;
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
                isMenuFour = true;

            } else {                System.out.println("Invalid input!");
                System.out.println("Please enter an integer value between 1 and 4.");
                printMenu();
                System.out.print("Choose an option: ");
                option = scnr.nextInt();
                System.out.println();
            }

        }

    }
}
