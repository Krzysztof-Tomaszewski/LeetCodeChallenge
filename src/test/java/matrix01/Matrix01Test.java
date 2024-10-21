package matrix01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Matrix01Test {

    @Test
    void testSmallMatrixWithZerosAndOnes() {
        Matrix01 solver = new Matrix01();
        int[][] input = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        assertArrayEquals(expected, solver.updateMatrix(input));
    }

    @Test
    void testSingleElementZero() {
        Matrix01 solver = new Matrix01();
        int[][] input = {
                {0}
        };
        int[][] expected = {
                {0}
        };
        assertArrayEquals(expected, solver.updateMatrix(input));
    }

    @Test
    void testLargeMatrixAllZeros() {
        Matrix01 solver = new Matrix01();
        int[][] input = new int[1000][1000]; // All zeros
        int[][] expected = new int[1000][1000]; // All zeros expected
        assertArrayEquals(expected, solver.updateMatrix(input));
    }

    @Test
    void testLargeMatrixAllOnes() {
        Matrix01 solver = new Matrix01();
        int[][] input = new int[1000][1000]; // All ones
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                input[i][j] = 1;
            }
        }
        int[][] expected = new int[1000][1000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                expected[i][j] = 1000; // Large distance to simulate complexity
            }
        }
        assertArrayEquals(expected, solver.updateMatrix(input));
    }

}
