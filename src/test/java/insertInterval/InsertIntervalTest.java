package insertInterval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertIntervalTest {

    @Test
    void testEmptyIntervals() {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        int[][] expected = {{5, 7}};
        assertArrayEquals(expected, new InsertInterval().insert(intervals, newInterval));
    }

    @Test
    void testNoOverlapBefore() {
        int[][] intervals = {{8, 10}, {12, 16}};
        int[] newInterval = {2, 6};
        int[][] expected = {{2, 6}, {8, 10}, {12, 16}};
        assertArrayEquals(expected, new InsertInterval().insert(intervals, newInterval));
    }

    @Test
    void testNoOverlapAfter() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {10, 12};
        int[][] expected = {{1, 3}, {6, 9}, {10, 12}};
        assertArrayEquals(expected, new InsertInterval().insert(intervals, newInterval));
    }

    @Test
    void testFullOverlap() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 7};
        int[][] expected = {{1, 9}};
        assertArrayEquals(expected, new InsertInterval().insert(intervals, newInterval));
    }

    @Test
    void testPartialOverlap() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        int[][] actual = new InsertInterval().insert(intervals, newInterval);
        assertArrayEquals(expected, actual);
    }
}
