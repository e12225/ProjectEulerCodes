package com.company;

/**
 * Question: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below two million.
 * Answer: 142913828922
 */

public class Ten {

    public static void main(String[] args) {
        System.out.println("Sum = " + getSumOfPrimes());
    }

    static long getSumOfPrimes() {

        long sum = 0L;
        long number = 2L;
        long d = 2L;

        while (number < 2000000) {
            if (d == number) {
                sum = sum + number;
                number++;
                d = 2;
            } else if (number % d == 0) {
                number++;
                d = 2;
            } else {
                d++;
            }
        }

        System.out.println();

        return sum;
    }
}
