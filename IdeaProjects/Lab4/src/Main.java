//input hex and output decimal
// Should work regardless of:
    // presence of 0x
    // letter case (DONE)
    // max value should be 0xFFFFFFFF (4294967295)

// use while loop
// use modulus

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        String hexNum;                                                              // hexadecimal number input
        String lowHex;                                                              // hex input changed to lowercase
        char letter1;                                                               // each subsequent character of hex input
        char letter2;
        char letter3;
        char letter4;
        char letter5;
        char letter6;
        char letter7;
        char letter8;
        int inputLength;


        System.out.println("Enter a hexadecimal number: ");
        hexNum = scnr.nextLine();
        lowHex = hexNum.toLowerCase();

        //System.out.println(lowHex);

         letter1 = lowHex.charAt(0);
         letter2 = lowHex.charAt(1);
         letter3 = lowHex.charAt(2);
         letter4 = lowHex.charAt(3);
         letter5 = lowHex.charAt(4);
         letter6 = lowHex.charAt(5);
         letter7 = lowHex.charAt(6);
         letter8 = lowHex.charAt(7);













       // System.out.println("Your number is " + " in decimal");

    }


}
