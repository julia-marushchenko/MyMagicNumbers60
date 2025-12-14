/**
 *  Java program to find numbers dividable by 3.
 */
package com.numbers;

import java.util.Random;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating an array with random integer element
        int [] arr = new int[27];

        // Adding 27 random values to the array
        for (int index = 0; index < 27; index++) {

            arr[index] = new Random().nextInt();

        }

        // Checking if elements of array are dividable by 3 and printing result to console in a loop
        for (int index = 0; index < 27; index++) {

            // Condition
            if (arr[index] % 3 == 0) {

                // Printing to console
                System.out.println(arr[index] + " is dividable by 3.");

            } else {

                // Printing to console
                System.out.println(arr[index] + " is not dividable by 3.");

            }
        }
    }
}