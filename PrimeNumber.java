/**
 * Prime Number
 * 0 and 1 are not counted as prime numbers.
 * The number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number.
 * All the even numbers can be divided by 2, so 2 is the only even prime minister.
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.print("Enter the number to find whether it is prime or not: ");
        Scanner input = new Scanner(System.in);
        int primeFactor = input.nextInt();

        boolean result = isPrime(primeFactor);
        if (result == false)
            System.out.println(primeFactor + " is not a prime number.");
        else
            System.out.println(primeFactor + " is a prime number.");
    }

    private static boolean isPrime(int number) {
        boolean flag = true;
        if (number == 1 || number == 0)
            flag = false;
        else {
            for ( int i=2; i <= number/2; i++) {
                if( number%i ==0)
                    flag = false;
            }
        }
        return flag;
    }
}
