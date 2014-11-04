package com.github.thatnerdjack.multiples;

import java.util.ArrayList;

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

    public static ArrayList findMultiplesTo(int a, int b) {
        int latestAnswer = a;
        ArrayList<Integer> multipleArray = new ArrayList<Integer>();

        for (int i = 1; latestAnswer <= b; i++) {
            latestAnswer = a * i;
            multipleArray.add(latestAnswer);
            if (((i + 1) * a) > b) {
                break;
            }
        }
        return multipleArray;
    }

    public static void leastCommonMultiple(int a, int b, int c) {
        ArrayList<Integer> num1Array = findMultiplesTo(a, c);
        ArrayList<Integer> num2Array = findMultiplesTo(b, c);

        for (int i = 0; i < num1Array.size(); i++) {
            for (int i2 = 0; i2 < num2Array.size(); i++) {
                int numTest1 = num1Array.get(i);
                int numTest2 = num2Array.get(i2);
                if (numTest1 == numTest2) {
                    System.out.println("The least common multiple of " + a + " and " + b + " is " + numTest1);
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {
        printMultiplesTo(2, 10);
        printMultiplesTo(12, 100);
        printMultiplesTo(1, 7);
        printMultiplesTo(8, 2);
        leastCommonMultiple(12, 100, 1000);
    }

}
