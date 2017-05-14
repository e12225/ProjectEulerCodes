package com.company;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Answer: 232792560
 */

public class Five {

    public static void main(String[] args) {

        int number = getNumber();
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is : " + number);
    }

    static int getNumber() {

        int number = 1;

        for (int d = 1; d <= 20; d++) {

            if (number % d != 0) {
                number++;
                d = 1;
            }
        }

        return number;
    }
}
