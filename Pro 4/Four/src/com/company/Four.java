package com.company;

/**
 * Question: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Answer: 906609
 */

public class Four {

    public static void main(String[] args) {
        // write your code here

        int palindrome = getLargestPalindrome();
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is : " + palindrome);
    }

    static int getLargestPalindrome() {

        int largestPalindrome = 0;

        for (int x = 100; x <= 999; x++) {

            for (int y = 100; y <= 999; y++) {

                int product = x * y;

                if (isPalindrome(product) && product >= largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }

    static boolean isPalindrome(int product) {

        int quotient1;
        int remainder1;
        int quotient2;
        int remainder2;
        int quotient3;
        int remainder3;
        int quotient4;
        int remainder4;
        int quotient5;
        int remainder5;

        if (product > 99999) {
            // When the product is a 6-digit number

            quotient1 = product / 100000;//5
            remainder1 = product % 100000;//67765

            quotient2 = remainder1 / 10000;//6
            remainder2 = remainder1 % 10000;//7765

            quotient3 = remainder2 / 1000;//7
            remainder3 = remainder2 % 1000;//765

            quotient4 = remainder3 / 100;//7
            remainder4 = remainder3 % 100;//65

            quotient5 = remainder4 / 10;//6
            remainder5 = remainder4 % 10;//5

            if (quotient1 == remainder5 && quotient2 == quotient5 && quotient3 == quotient4) {
                //product is a palindrome
                System.out.println(product + " is a 6-digit palindrome");
                return true;
            } else {
                //product is not a palindrome
                return false;
            }
        } else {
            // When the product is a 5-digit number

            quotient1 = product / 10000;//1
            remainder1 = product % 10000;//3231

            quotient2 = remainder1 / 1000;//3
            remainder2 = remainder1 % 1000;//231

            //The middle digit is need not to be considered in 5-digit palindrome case. So, quotient3 is ignored

            remainder3 = remainder2 % 100;//31

            quotient4 = remainder3 / 10;//3
            remainder4 = remainder3 % 10;//1

            if (quotient1 == remainder4 && quotient2 == quotient4) {
                //product is a palindrome
                System.out.println(product + " is a 5-digit palindrome");
                return true;
            } else {
                //product is not a palindrome
                return false;
            }
        }
    }
}
