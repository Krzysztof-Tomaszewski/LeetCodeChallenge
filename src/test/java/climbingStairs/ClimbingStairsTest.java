package climbingStairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    void testSmallSteps() {
        ClimbingStairs solver = new ClimbingStairs();
        assertEquals(2, solver.climbStairs(2));  // 2 ways
        assertEquals(3, solver.climbStairs(3));  // 3 ways
    }

    @Test
    void testLargerSteps() {
        ClimbingStairs solver = new ClimbingStairs();
        assertEquals(5, solver.climbStairs(4));  // 5 ways
        assertEquals(8, solver.climbStairs(5));  // 8 ways
    }

    @Test
    void testEdgeCaseSingleStep() {
        ClimbingStairs solver = new ClimbingStairs();
        assertEquals(1, solver.climbStairs(1));  // Only 1 way for 1 step
    }

    @Test
    void testUpperBoundary() {
        ClimbingStairs solver = new ClimbingStairs();
        assertEquals(1836311903, solver.climbStairs(45));  // Max value for constraint
    }

    @Test
    void testIntermediateValues() {
        ClimbingStairs solver = new ClimbingStairs();
        assertEquals(13, solver.climbStairs(6));  // 13 ways
        assertEquals(21, solver.climbStairs(7));  // 21 ways
    }
}
