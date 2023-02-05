package basic1.exo17;

import java.math.BigInteger;
import java.util.Scanner;

public class exo17 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //NOTE:declartion des variables
        BigInteger b1;
        BigInteger b2;
        BigInteger sum;
        Scanner sc = new Scanner(System.in);
        String binaryNumber ="";
        String binaryNumber1 ="";

        //NOTE: get binary variables
        System.out.print("Veuillez Entrez un nombre binaire: ");
        do {//NOTE:verify if it is binary number
             binaryNumber = sc.nextLine();
            if (!binaryNumber.matches("[01]+")) {
                System.err.println("Invalid Binary Number Entered! Try Again...");
                continue;
            }
            //System.out.println("\nThe binary number \"" + binaryNumber + "\" is valid.");
            break;
        } while (true);

        System.out.print("Veuillez Entrez un nombre binaire: ");
        do {//NOTE:verify if it is binary number
             binaryNumber1 = sc.nextLine();
             //NOTE: regex [01]+ :means any combination from 0 and 1 repeated one or more.
            if (!binaryNumber1.matches("[01]+")) {
                System.err.println("Invalid Binary Number Entered! Try Again...");
                continue;
            }
            //System.out.println("\nThe binary number \"" + binaryNumber + "\" is valid.");
            break;
        } while (true);
        sc.close();

        //NOTE: Calcul binaire et affichage
        b1 = new BigInteger(binaryNumber, 2);
        b2 = new BigInteger(binaryNumber1, 2);
        sum = b1.add(b2);
        System.out.println("la somme de ces deux variables binaires : "+sum.toString(2));
    }
}
