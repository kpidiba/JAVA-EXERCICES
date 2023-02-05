package basic1.exo20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a Java program to convert a decimal number to hexadecimal number.
 */

 
public class exo20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        try {
            System.out.print("Entrez un nombre decimal: ");
            value = sc.nextInt();
            System.out.println(value + " en hexadecimal: " + Integer.toHexString(value).toUpperCase());
        } catch (Exception e) {
            System.out.println("S'il vous plait entrez un nombre decimal");
        }
        sc.close();
    }
}
