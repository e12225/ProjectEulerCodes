package com.company;

/**
 * Question : If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * Answer: 233168
 */

public class One {

    public static void main(String[] args) {

        int s = getSum();
        System.out.println("The sum of multiples of 3 or 5 below 1000 is : " + s);
    }

    public static int getSum() {

        int sum = 0;

        for (int x = 1; x < 1000; x++) {

            if (x % 3 == 0 || x % 5 == 0) {
                sum = sum + x;
            }
        }

        return sum;
    }

}
