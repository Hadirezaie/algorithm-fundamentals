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

}
