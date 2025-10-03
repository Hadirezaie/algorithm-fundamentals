package com.hadirezaie.algorithm_fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindLargestNumberTest {

    @Test
    void testFindMaximum_withPositiveNumbers() {
        int[] numbers = { 3, 7, 2, 9, 1, 8, 12, 4 };
        int result = FindLargestNumber.findLargestNum(numbers);
        assertEquals(12, result);
    }

    @Test
    void testFindMaximum_withNegativeNumbers() {
        int[] numbers = { -3, -7, -2, -9, -1, -8, -12, -4 };
        int result = FindLargestNumber.findLargestNum(numbers);
        assertEquals(-1, result);
    }

    @Test
    void testFindFindMaximum_withMixedNumbers() {
        int[] numbers = { -3, 7, -2, 9, -1, 8, -12, 4 };
        int result = FindLargestNumber.findLargestNum(numbers);
        assertEquals(9, result);
    }

    @Test
    void testFindMaximum_withSingleElement() {
        int[] numbers = { 5 };
        int result = FindLargestNumber.findLargestNum(numbers);
        assertEquals(5, result);
    }
}
