/**
 * Reverse a number
 * We need to calculate the remainder of the number using the modulo
 * After that, we need to multiply the variable reverse by 10 and add the remainder into it.
 * We then divide the number by 10 and repeat steps until the number becomes 0.
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverseNumber(number);
    }
    private static void reverseNumber(int number) {
        int reverse = 0;
        while(number > 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
