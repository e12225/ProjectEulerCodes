package com.company;

/**
 * Question: A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52. There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * Answer: 31875000
 */

public class Nine {

    public static void main(String[] args) {

        getPythagoreanTriplet();
    }

    static void getPythagoreanTriplet() {

        int a, b, c;

        for (a = 1; a < 1000; a++) {

            for (b = a + 1; b < 1000; b++) {

                c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println("The required Pythagorean triplet is : " + a + "," + b + "," + c);
                    System.out.println("product = " + (a * b * c));
                }
            }
        }
    }
}
