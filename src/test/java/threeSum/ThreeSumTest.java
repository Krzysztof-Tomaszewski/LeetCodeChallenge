package threeSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

class ThreeSumTest {

    private ThreeSum solver = new ThreeSum();

    @Test
    void testExampleCase() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testNoSolution() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testAllZeroes() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = List.of(
                List.of(0, 0, 0)
        );
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testLargeRangeOfNumbers() {
        int[] nums = {-4, -2, -1, 0, 1, 2, 3, 4};
        List<List<Integer>> expected = List.of(
                List.of(-4, 0, 4),
                List.of(-4, 1, 3),
                List.of(-2, -1, 3),
                List.of(-2, 0, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testDuplicatesInResult() {
        int[] nums = {-2, 0, 1, 1, 2, -1, -1};
        List<List<Integer>> expected = List.of(
                List.of(-2, 0, 2),
                List.of(-2, 1, 1),
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testMixedPositiveAndNegativeWithZero() {
        int[] nums = {-5, -2, -1, 0, 1, 2, 3, 5};
        List<List<Integer>> expected = List.of(
                List.of(-5, 0, 5),
                List.of(-5, 2, 3),
                List.of(-2, -1, 3),
                List.of(-2, 0, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testArrayWithSingleNegative() {
        int[] nums = {-1};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testArrayWithSinglePositive() {
        int[] nums = {1};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void testArrayWithOnlyZeroes() {
        int[] nums = {0, 0, 0, 0, 0};
        List<List<Integer>> expected = List.of(
                List.of(0, 0, 0)
        );
        assertEquals(expected, solver.threeSum(nums));
    }
}
