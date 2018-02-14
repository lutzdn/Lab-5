import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        int MPG;
        double tankCapacity;
        double tankPercentage;
        double rawRange;

//        MPG = 1;
//        tankCapacity = 2;
//        tankPercentage = 3;


        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        MPG = scnr.nextInt();
        if (MPG <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");

        tankCapacity = scnr.nextDouble();
        if (tankCapacity <= 0) {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        tankPercentage = scnr.nextDouble();

        if (!((tankPercentage >= 0) && (tankPercentage <= 100))) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
        }


        rawRange = MPG * tankCapacity * (tankPercentage * 0.01);

        if (rawRange <= 25) {
            System.out.print("Attention! Your current estimated range is running low: " + (int) rawRange + " miles left!!!");
        }
        else {
            System.out.print("Keep driving! Your current estimated range is: " + (int) rawRange + " miles!");
        }

    }
}

