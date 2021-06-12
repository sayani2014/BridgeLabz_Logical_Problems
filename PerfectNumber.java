/**
 * Perfect Number
 * 28 is the perfect number because when we sum the divisors of 28, it will result in the same number.
 * The divisors of 28 are 1, 2, 4, 7, and 14. So, 28 = 1+2+4+7 => 28 = 28
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        int perfect_number = PerfectNumber(number);
        if(perfect_number == number)
            System.out.println(number +" is a perfect  number");
        else
            System.out.println(number +" is not a perfect number because of " +perfect_number);
    }
    private static int PerfectNumber(int num) {
        int i = 1;
        int sum = 0;
        for (i=1; i<num; i++) {
            if(num%i==0)
                sum += i;
        }
        return sum;
    }
}
