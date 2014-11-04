package com.github.thatnerdjack.multiples;

/**
 * Created by block7 on 11/4/14.
 */
public class Multiples {

    public static void printMultiplesTo(int a, int b) {
        String multiples = "";
        int latestAnswer = a;

        for (int i = 1; latestAnswer <= b; i++) {
            latestAnswer = a * i;
            multiples += latestAnswer + " ";
            if (((i + 1) * a) > b) {
                break;
            }
        }
        System.out.println("multiples of " + a + " up to " + b + " are: " + multiples);
    }

    public static void main(String args[]) {
        printMultiplesTo(2, 10);
        printMultiplesTo(12, 100);
        printMultiplesTo(1, 7);
        printMultiplesTo(8, 2);
    }

}
