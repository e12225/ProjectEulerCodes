package com.company;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * Answer: 104743
 */

public class Seven {

    public static void main(String[] args) {

        System.out.println("Sixth prime is : " + getThePrime());
    }

    static int getThePrime() {

        int prime = 0;
        int count = 0;
        int number = 2;
        int d;

        while (count < 10001) {

            for (d = 2; d < number; d++) {

                if (number % d == 0) {
                    break;
                }
            }

            if (number == d) {
                count++;
                prime = number;
                System.out.print(" " + prime);
            }

            number++;
        }

        System.out.println();

        return prime;
    }
}
