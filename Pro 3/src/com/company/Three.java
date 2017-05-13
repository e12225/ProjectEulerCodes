package com.company;

/**
 * Question:  The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *  Answer: 6857
 */

/**
 * TODO : There is an issue in my solution. The program doesn't terminate itself so we have to force it.
 * Due to that, unless putting the print statements for each prime factor, it will not indicate the largest prime factor.
 */

public class Three {

    public static void main(String[] args) {

        long inputNumber = 600851475143L;
        long result = getPrimeFactors(inputNumber);
        System.out.println("The largest prime factor of " + inputNumber + " is : " + result);

    }

    static long getPrimeFactors(long number) {

        long largestPrimeFactor = 0;
        long suspectFactor;

        for (suspectFactor = 2; suspectFactor < number; suspectFactor++) {
            if (number % suspectFactor == 0) {
                if (isAPrimeFactor(suspectFactor)) {
                    System.out.println(suspectFactor + " is a prime factor of " + number);
                    largestPrimeFactor = suspectFactor;
                }
            }
        }

        return largestPrimeFactor;
    }

    static boolean isAPrimeFactor(long factor) {

        int x;
        for (x = 2; x < factor; x++) {
            if (factor % x == 0)
                break;
        }

        if (x == factor) {
            return true;
        } else {
            return false;
        }
    }
}
