package com.company;

public class Two {

    public static void main(String[] args) {

        getfibonacciSum();

    }

    static void getfibonacciSum() {

        int a = 1;
        int b = 2;
        int c = a + b;

        /**
         * Printing the terms in fibonacci sequence is not compulsory here.
         */

        System.out.print(" " + a);
        System.out.print(" " + b);

        int evenSum = 2;

        while (c < 4000000) {

            if(c%2 == 0){
                evenSum = evenSum + c;
            }
            System.out.print(" " + c);
            a = b;
            b = c;
            c = a + b;
        }

        System.out.println();
        System.out.println("Sum of even-valued terms is : " + evenSum);
    }
}
