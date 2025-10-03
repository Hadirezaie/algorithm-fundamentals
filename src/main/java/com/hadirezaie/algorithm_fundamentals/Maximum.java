package com.hadirezaie.algorithm_fundamentals;

public class Maximum {

    /**
     * Find the largest number in an array
     * Algorithm features:
     * - Correctness: Works for all arrays
     * - Efficiency: Linear time O(n)
     * - Readability: Clear and well-documented code
     */
    public static int findMaximum(int[] numbers) {
        // Check for empty array
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        int maxNumber = numbers[0]; // Start with the first element

        // Check all elements in the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        return maxNumber;
    }

}
