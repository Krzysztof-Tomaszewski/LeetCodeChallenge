package twoSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testExample1() {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testExample2() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testExample3() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testNegativeNumbers() {
        TwoSum solution = new TwoSum();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    public void testNoSolution() {
        TwoSum solution = new TwoSum();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        int[] result = solution.twoSum(nums, target);
        assertNull(result);
    }
}
