package com.company;

/**
 * Question: The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,(1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * Answer: 25164150
 */

public class Six {

    public static void main(String[] args) {

        int diff = getSquareOfSum() - getSumOfSquares();
        System.out.println("Difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is : " + diff);
    }

    static int getSumOfSquares() {

        int sum1 = 0;

        for (int x = 1; x <= 100; x++) {
            sum1 = sum1 + (x * x);
        }

        return sum1;
    }

    static int getSquareOfSum() {

        int sum2 = 0;

        for (int y = 1; y <= 100; y++) {
            sum2 = sum2 + y;
        }

        return (sum2 * sum2);
    }
}
