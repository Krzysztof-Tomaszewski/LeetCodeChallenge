package binarySearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void testExampleCase1() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void testExampleCase2() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void testExampleCase3() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12, 15, 18, 20, 21, 25, 37, 34, 55};
        int target = 34;
        int expected = 12;
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void testTargetAtBeginning() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 1;
        int expected = 0;
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void testTargetAtEnd() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int expected = 4;
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void testSingleElementFound() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {5};
        int target = 5;
        int expected = 0;
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void testSingleElementNotFound() {
        BinarySearch solution = new BinarySearch();
        int[] nums = {5};
        int target = 0;
        int expected = -1;
        assertEquals(expected, solution.search(nums, target));
    }
}
