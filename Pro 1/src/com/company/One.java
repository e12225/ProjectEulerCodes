package com.company;

public class One {

    public static void main(String[] args) {

        int s = getSum();
        System.out.println(s);
    }

    public static int getSum() {

        int sum = 0;

        for (int x = 1; x < 1000; x++) {

            if (x % 3 == 0 || x % 5 == 0) {
                sum = sum + x;
            }
        }

        return sum;
    }

}
