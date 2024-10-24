package kClosestPointsToOrigin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {

    // Test case 1: Regular case with positive coordinates
    @Test
    void testCase1() {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        int[][] expected = {{-2, 2}};
        int[][] result = new KClosestPointsToOrigin().kClosest(points, k);
        assertArrayEquals(expected, result);
    }

    // Test case 2: All points at the origin
    @Test
    void testCase2() {
        int[][] points = {{0, 0}, {0, 0}, {0, 0}};
        int k = 2;
        int[][] expected = {{0, 0}, {0, 0}};
        int[][] result = new KClosestPointsToOrigin().kClosest(points, k);
        assertArrayEquals(expected, result);
    }

    // Test case 3: Large values for coordinates
    @Test
    void testCase3() {
        int[][] points = {{10000, 10000}, {-10001, -10000}};
        int k = 1;
        int[][] expected = {{10000, 10000}};
        int[][] result = new KClosestPointsToOrigin().kClosest(points, k);
        assertArrayEquals(expected, result);
    }

    // Test case 4: More points than required
    @Test
    void testCase4() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int k = 2;
        int[][] expected = {{1, 2}, {2, 3}};
        int[][] result = new KClosestPointsToOrigin().kClosest(points, k);
        assertArrayEquals(expected, result);
    }

    // Test case 5: Single point
    @Test
    void testCase5() {
        int[][] points = {{1, 1}};
        int k = 1;
        int[][] expected = {{1, 1}};
        int[][] result = new KClosestPointsToOrigin().kClosest(points, k);
        assertArrayEquals(expected, result);
    }
}
