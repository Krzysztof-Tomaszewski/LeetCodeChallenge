package maximumSubarray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

    @Test
    void testExample1() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        assertEquals(expected, solution.maxSubArray(nums));
    }

    @Test
    void testExample2() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, solution.maxSubArray(nums));
    }

    @Test
    void testExample3() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {5, 4, -1, 7, 8};
        int expected = 23;
        assertEquals(expected, solution.maxSubArray(nums));
    }

    @Test
    void testAllNegativeNumbers() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-1, -2, -3, -4};
        int expected = -1;
        assertEquals(expected, solution.maxSubArray(nums));
    }

    @Test
    void testSingleLargeNegativeNumber() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-1000};
        int expected = -1000;
        assertEquals(expected, solution.maxSubArray(nums));
    }
}
