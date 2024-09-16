package floodFill;

/**
 * Link to the problem: https://leetcode.com/problems/flood-fill/
 * <p>
 * Problem Description:
 * An image is represented by a 2D array of integers, where `image[i][j]` represents the pixel value of the image.
 * You are also given three integers `sr`, `sc`, and `newColor`.
 * <p>
 * Starting from the pixel `image[sr][sc]`, perform a flood fill. Replace the color of the starting pixel and all
 * adjacent pixels (connected 4-directionally with the same color as the starting pixel) with `newColor`.
 * <p>
 * Return the modified image after performing the flood fill.
 * <p>
 * Constraints:
 * - m == image.length
 * - n == image[i].length
 * - 1 <= m, n <= 50
 * - 0 <= image[i][j], newColor < 2^16
 * - 0 <= sr < m
 * - 0 <= sc < n
 */

class FloodFill {
    int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int actualColor = image[sr][sc];

        if (actualColor == newColor) return image;

        image[sr][sc] = newColor;
        if ((sr - 1) >= 0 && image[sr - 1][sc] == actualColor) {
            floodFill(image, sr - 1, sc, newColor);
        }
        if ((sr + 1 < image.length) && image[sr + 1][sc] == actualColor) {
            floodFill(image, sr + 1, sc, newColor);
        }
        if ((sc - 1) >= 0 && image[sr][sc - 1] == actualColor) {
            floodFill(image, sr, sc - 1, newColor);
        }
        if ((sc + 1) < image[sr].length && image[sr][sc + 1] == actualColor) {
            floodFill(image, sr, sc + 1, newColor);
        }
        return image;
    }
}

