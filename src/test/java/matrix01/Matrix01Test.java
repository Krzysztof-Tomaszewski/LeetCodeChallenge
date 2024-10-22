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
        assertArrayEquals(expected, solver.updateMatrixBFS(input));
    }

    @Test
    void testLargeMatrixWithZerosAndOnes() {
        Matrix01 solver = new Matrix01();
        int[][] input = new int[1000][1000];
        // Set the top-left and bottom-right corners as 0, the rest as 1
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if ((i == 0 && j == 0) || (i == 999 && j == 999)) {
                    input[i][j] = 0;
                } else {
                    input[i][j] = 1;
                }
            }
        }

        int[][] expected = new int[1000][1000];
        // Expected result: distance increases as you move away from the nearest 0
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                expected[i][j] = Math.min(i + j, 1998 - i - j);
            }
        }

        assertArrayEquals(expected, solver.updateMatrixBFS(input));
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
        assertArrayEquals(expected, solver.updateMatrixBFS(input));
    }
}
