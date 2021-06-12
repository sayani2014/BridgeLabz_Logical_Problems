/**
 * Coupon Numbers
 * I/P -> N Distinct Coupon Number
 * Logic -> repeatedly choose a random number and check whether it's a new one.
 * O/P -> total random number needed to have all distinct numbers.
 * Functions => Write Class Static Functions to generate random numbers and to process distinct coupons.
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.*;
public class CouponNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times you want to generate the coupon number: ");
        int number = input.nextInt();
        CouponNumbers(number);
    }
    private static void CouponNumbers(int number) {
        //For distinct numbers, use Set, since all its implementations remove duplicates
        Set<Integer> couponNumber = new LinkedHashSet<Integer>();
        //set range according to the number of times user want to generate coupon
        int range=10;
        if(number!=0 && number<=10)
            range = 10;
        else
            range *= number;
        while (couponNumber.size() < number) {
            couponNumber.add((int) Math.floor(Math.random() * range) + 1);
        }
        System.out.println("Distinct coupon numbers are: "+couponNumber);
    }
}