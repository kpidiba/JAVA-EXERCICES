package basic1.exo19;

import java.util.Scanner;

/*
 * Write a Java program to convert a decimal number to binary number.
 */
public class exo19 {
    public static void main(String[] args) {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre Decimal: ");
        try {
            value = sc.nextInt();
            System.out.println(value + " en binaire :" + Integer.toBinaryString(value));
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        sc.close();
    }
}
