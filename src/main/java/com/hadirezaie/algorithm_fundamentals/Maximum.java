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

    public static int findMaximumWithLogging(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        System.out.println("Starting maximum finding algorithm...");
        int maxNumber = numbers[0];
        System.out.println("Initial max value: " + maxNumber);

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Checking number: " + numbers[i]);

            if (numbers[i] > maxNumber) {
                System.out.println("New max found: " + numbers[i]);
                maxNumber = numbers[i];
            }
        }

        System.out.println("Final maximum: " + maxNumber);
        return maxNumber;
    }

}
