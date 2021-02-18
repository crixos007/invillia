package com.invillia.challenge.java;

import java.util.Arrays;


/**
 * Challenge 3
 *
 * Java and Algorithm
 *
 * Write the code to sort an array of given integers using the Bubble Sorting Algorithm.
 *
 * Visualization:
 *  [-4, 8, 3, 2, 1, 0, 15]
 *  [-4, 3, 8, 2, 1, 0, 15]
 *  [-4, 3, 2, 8, 1, 0, 15]
 *  [-4, 3, 2, 1, 8, 0, 15]
 *  [-4, 3, 2, 1, 0, 8, 15]
 *  [-4, 2, 3, 1, 0, 8, 15]
 *  [-4, 2, 1, 3, 0, 8, 15]
 *  [-4, 2, 1, 0, 3, 8, 15]
 *  [-4, 1, 2, 0, 3, 8, 15]
 *  [-4, 1, 0, 2, 3, 8, 15]
 *  [-4, 0, 1, 2, 3, 8, 15]
 *
 */
public class Challenge3 {

    public static void bubbleSort(int[] numbers) {
    	Arrays.sort(numbers); 
    }

    public static void main(String args[]) {

        int numbers[] = {8, -4, 3, 2, 1, 0, 15};

        System.out.println("Before: " + Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("After: " + Arrays.toString(numbers));

    }
}
