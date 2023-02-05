package basic1.exo18;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Means any combination from 0 and 1 repeated one or more.
 */
public class exo18 {
    
    public static void main(String[] args) {
         //NOTE:declartion des variables
         BigInteger b1;
         BigInteger b2;
         BigInteger multi;
         Scanner sc = new Scanner(System.in);
         String binaryNumber ="";
         String binaryNumber1 ="";
 
         //NOTE: get binary variables
         System.out.print("Veuillez Entrez un nombre binaire: ");
         do {//NOTE:verify if it is binary number
              
             try{
                binaryNumber = sc.nextLine();
             }catch(Exception e){
                e.printStackTrace();
             }
             if (!binaryNumber.matches("[01]+")) {
                 System.err.println("Invalid Binary Number Entered! Try Again...");
                 continue;
             }
            //System.out.println("\nThe binary number \"" + binaryNumber + "\" is valid.");
             break;
         } while (true);
 
         System.out.print("Veuillez Entrez un nombre binaire: ");
         do {//NOTE:verify if it is binary number
              try{
                binaryNumber1 = sc.nextLine();
              }catch(Exception e){
                e.printStackTrace();
              }
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
        multi = b1.multiply(b2);
        System.out.println("la somme de ces deux variables binaires : "+multi.toString(2));
    }
    
}
