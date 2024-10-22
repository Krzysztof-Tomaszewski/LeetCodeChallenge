package matrix01;

// Problem link: https://leetcode.com/problems/01-matrix/description/

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 * The distance between two adjacent cells is 1.
 * <p>
 * Constraints:
 * 1. m == mat.length
 * 2. n == mat[i].length
 * 3. 1 <= m, n <= 10^4
 * 4. 1 <= m * n <= 10^4
 * 5. mat[i][j] is either 0 or 1.
 * 6. There is at least one 0 in mat.
 */
class Matrix01 {

    private static final int MAX_DISTANCE_PLACEHOLDER = 10000;

    public int[][] updateMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] = 1 + minAbove(mat, i, j);
                }
            }
        }

        for (int i = mat.length - 1; i >= 0 ; i--) {
            for (int j = mat[0].length - 1; j >= 0; j--) {
                mat[i][j] = Math.min(mat[i][j], 1 + minBelow(mat, i, j));
            }
        }
        return mat;
    }

    private int minAbove(int[][] mat, int x, int y) {
        return Math.min(
                x > 0 ? mat[x-1][y] : MAX_DISTANCE_PLACEHOLDER,
                y > 0 ? mat[x][y-1] : MAX_DISTANCE_PLACEHOLDER
        );
    }

    private int minBelow(int[][] mat, int x, int y) {
        return Math.min(
                (x + 1 < mat.length) ? mat[x+1][y] : MAX_DISTANCE_PLACEHOLDER,
                (y + 1 < mat[0].length) ? mat[x][y+1] : MAX_DISTANCE_PLACEHOLDER
        );
    }

    public int[][] updateMatrixBFS(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return new int[0][0];

        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int MAX_VALUE = m * n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = MAX_VALUE;
                }
            }
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : directions) {
                int r = cell[0] + dir[0], c = cell[1] + dir[1];
                if (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] > mat[cell[0]][cell[1]] + 1) {
                    queue.offer(new int[]{r, c});
                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
                }
            }
        }

        return mat;
    }
}

