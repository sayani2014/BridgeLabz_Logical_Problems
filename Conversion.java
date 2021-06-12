/**
 * Convert to Binary, read an integer as an Input
 * Swap nibbles and find the new number.
 * Find the resultant number is the number is a power of 2.
 * For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = input.nextInt();

        long binary = decToBinary(decimal);
        System.out.println("The binary value is: " +binary);

        long new_binary = performSwap(binary);

        int decimal_value = binaryToDecimal(new_binary);
        System.out.println("Th decimal value is: " +decimal_value);

        //System.out.print(swapNibbles(decimal));
    }
    private static long decToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (n!=0) {
            remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
    private static long performSwap(long binary){
        String padded_binary = "";
        String temp = "";
        int length = String.valueOf(binary).length();
        if(length < 8)
            padded_binary = StringUtils.leftPad("" + binary, 8, "0" );
        String highNibble = padded_binary.substring(0,4);
        //System.out.println(highNibble);
        String lowNibble = padded_binary.substring(4,8);
        //System.out.println(lowNibble);
        temp = highNibble;
        highNibble = lowNibble;
        lowNibble = temp;
        long binary1 =  Long.parseLong(highNibble.concat(lowNibble));

        return binary1;
    }
    public static int binaryToDecimal(long binary) {
        long num = binary;
        int dec_value = 0;
        int base = 1;                    // value to 1, i.e 2^0
        long temp = num;
        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        return dec_value;
    }

    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }
}
