package com.company;

/**
 * Question : The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * <p>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * <p>
 * Answer :
 */

public class Fourteen {

    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    static long getNumber() {

        long startingNumber = 1;
        long nextNumber;
        long chainLength = 1;
        long maxChainLength = 0;
        long maxChainGivingNumber = 0;

        nextNumber = startingNumber;

        while (startingNumber < 1000000) {

            if (nextNumber % 2 == 0) {
                nextNumber = nextNumber / 2;
            } else {
                nextNumber = (3 * nextNumber) + 1;
            }
            chainLength++;

            if (nextNumber == 1) {
                //chain ends
                if (chainLength > maxChainLength) {
                    maxChainLength = chainLength;
                    maxChainGivingNumber = startingNumber;
                }
                startingNumber++;
                nextNumber = startingNumber;
                chainLength = 0;
            }
        }
        return maxChainGivingNumber;
    }

}
