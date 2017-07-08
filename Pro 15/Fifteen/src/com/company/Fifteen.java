package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Question : Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 * <p>
 * Answer :
 */

public class Fifteen {

    public static void main(String[] args) {
        // write your code here
        //System.out.println(getRoutes(18));
        recursionTestMethod(6);
    }

    static long getRoutes(long gridSize) {

        long numberOfRoutes = 0;
        long currentGridSize = 2;

        HashMap<Long, Long[]> sequences = new HashMap<>(); // (grid size, sequence terms)

        if (gridSize == 2) {
            numberOfRoutes = 3 * 2; //6
        } else {
            Long[] x = new Long[(int) currentGridSize];
            x[0] = 1L;
            x[1] = 2L;
            sequences.put(2L, x); // (2, [1 2])

            currentGridSize = 3;
            Collection previousSequences;
            List<Long[]> previousSequences_;
            Long[] requiredPreviousSeq;

            long sequenceIndex = 0;

            while (currentGridSize <= gridSize) {

                x = new Long[(int) currentGridSize];
                x[0] = 1L;

                previousSequences = sequences.values();
                previousSequences_ = new ArrayList(previousSequences);

                requiredPreviousSeq = previousSequences_.get((int) sequenceIndex);

                for (int index = 1; index < currentGridSize - 1; index++) {
                    x[index] = x[index - 1] + requiredPreviousSeq[index];
                }
                x[(int) currentGridSize - 1] = x[(int) currentGridSize - 2] * 2L; // last term of the sequence

                sequences.put(currentGridSize, x);
                sequenceIndex++;
                currentGridSize++;
            }

            currentGridSize--;

            //calculating the number of routes
            for (int i = 0; i < currentGridSize; i++) {
                numberOfRoutes = numberOfRoutes + x[i];
            }
        }

        return numberOfRoutes;
    }

    static void recursionTestMethod(int value) {

        value = value + 5;

        while (value <= 25) {
            System.out.print(value);
            recursionTestMethod(value);
        }
    }
}
