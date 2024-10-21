package matrix01;

// Problem link: https://leetcode.com/problems/01-matrix/description/

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

    public int[][] updateMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] = findNearestZero(mat, i, j);
                }
            }
        }
        return mat;
    }

    private int findNearestZero(int[][] mat, int i, int j) {
        if (i - 1 >= 0 && mat[i - 1][j] == 0) {
            return 1;
        }
        if (i + 1 < mat.length && mat[i + 1][j] == 0) {
            return 1;
        }
        if (j - 1 >= 0 && mat[i][j - 1] == 0) {
            return 1;
        }
        if (j + 1 < mat[0].length && mat[i][j + 1] == 0) {
            return 1;
        }

        int up = i - 1 >= 0 ? findNearestZero(mat, i - 1, j) : Integer.MAX_VALUE;
        int down = i + 1 < mat.length ? findNearestZero(mat, i + 1, j) : Integer.MAX_VALUE;;
        int left = j - 1 >= 0 ? findNearestZero(mat, i, j - 1) : Integer.MAX_VALUE;;
        int right = j + 1 < mat[0].length ? findNearestZero(mat, i, j + 1) : Integer.MAX_VALUE;;
        return 1 + Math.min(up, Math.min(down, Math.min(left, right)));
    }

}

