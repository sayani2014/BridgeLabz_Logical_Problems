/**
 * Decimal to Binary Conversion
 * Steps:
      25/2 = 12, remainder is 1
      12/2 = 6, remainder is 0
      6/2 = 3, remainder is 0
      3/2 = 1, remainder is 1
      1/2 = 0, remainder is 1
 * Read from the bottom to top as 11001.
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = input.nextInt();

        decToBinary(decimal);
    }
    private static void decToBinary(int num)
    {
        //System.out.println(Integer.toBinaryString(num));
        int binary[] = new int[100];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        System.out.print("Decimal to Binary: ");
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
    /*public static double toDecimal(double binary)
    {

        String findLength=String.valueOf((int) binary);

        double decimal=0;
        int i=0;
        while(binary>=1)
        {

            int modulus=(int) (binary%10);
            binary=(int) binary/10;
            decimal=decimal+modulus*Math.pow(2, i);
            i=i+1;
        }

        return decimal;
    }*/
}
