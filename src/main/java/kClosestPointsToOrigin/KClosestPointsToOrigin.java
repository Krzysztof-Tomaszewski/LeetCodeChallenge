package kClosestPointsToOrigin;

import java.util.Stack;

/**
 * LeetCode Problem: K Closest Points to Origin
 * https://leetcode.com/problems/k-closest-points-to-origin/description/
 *
 * Problem description:
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane
 * and an integer k, return the k closest points to the origin (0, 0).
 *
 * The distance between two points on the X-Y plane is the Euclidean distance.
 * You may return the answer in any order.
 * The answer is guaranteed to be unique (except for the order that it is in).
 *
 * Example 1:
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 *
 * Example 2:
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 *
 * Constraints:
 * 1 <= k <= points.length <= 10^4
 * -10^4 <= xi, yi <= 10^4
 */
class KClosestPointsToOrigin {

    int[][] kClosest(int[][] points, int k) {
        if(k == 1 && points.length == 1) {
            return points;
        }
        ClosestPointsToOriginList closestPointsToOriginList = new ClosestPointsToOriginList(k);
        for (int[] point : points) {
            closestPointsToOriginList.put(point);
        }

        return closestPointsToOriginList.getPoints();
    }
}

class ClosestPointsToOriginList {

    private int[][] points;
    private int count;

    ClosestPointsToOriginList(int k) {
        points = new int[k][3];
        count = 0;
    }

    boolean isFull() {
        return points.length == count;
    }

    void put(int[] point) {
        int distance = point[0] * point[0] + point[1] * point[1];
        if(isFull()) {
            for (int i = 0; i < points.length; i++) {
                int[] each = points[i];
                if (each[0] > distance) {
                    points[i][1] = point[0];
                    points[i][2] = point[1];
                    points[i][0] = distance;
                    return;
                }
            }
        } else {
            points[count][1] = point[0];
            points[count][2] = point[1];
            points[count][0] = distance;
            count++;
        }
    }

    public int[][] getPoints() {
        int[][] newPoints = new int[points.length][2];
        for (int i = 0; i < points.length; i++) {
            newPoints[i][0] = points[i][1];
            newPoints[i][1] = points[i][2];
        }
        return newPoints;
    }
}

