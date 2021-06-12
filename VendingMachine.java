/**
 * There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine.
 * I/P -> read the Change in Rs to be returned by the Vending Machine
 * Logic -> Use Recursion and check for largest value of the Note to return change to get to the minimum number of Notes.
 * O/P -> Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.Scanner;

public class VendingMachine extends Exception{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notes = new int[]{ 1000, 500, 100, 50, 10, 5, 2, 1 };
        int[] noteCounter = new int[8];
        System.out.print("Enter the change to be returned by the Vending Machine: Rs. ");
        int amount = input.nextInt();
        int sizeOfArray = notes.length;

        countCurrency(amount, notes, sizeOfArray,noteCounter);
    }
    public static void countCurrency(int amount, int notes[], int sizeOfArray, int noteCounter[]) {
        for (int i = 0; i < sizeOfArray; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                countCurrency(amount - noteCounter[i] * notes[i], notes, sizeOfArray, noteCounter);
                return;
            }
        }
        System.out.println("Currency Count ->");
        for (int i = 0; i < sizeOfArray; i++) {
            if (noteCounter[i] != 0) {
                System.out.println("Rs. " +notes[i] + " : " + noteCounter[i] + " in count.");
            }
        }
    }
}
