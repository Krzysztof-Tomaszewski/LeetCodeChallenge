package kClosestPointsToOrigin;

import java.util.Objects;
import java.util.PriorityQueue;

/**
 * LeetCode Problem: K Closest Points to Origin
 * https://leetcode.com/problems/k-closest-points-to-origin/description/
 * <p>
 * Problem description:
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane
 * and an integer k, return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance.
 * You may return the answer in any order.
 * The answer is guaranteed to be unique (except for the order that it is in).
 * <p>
 * Example 1:
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * <p>
 * Example 2:
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * <p>
 * Constraints:
 * 1 <= k <= points.length <= 10^4
 * -10^4 <= xi, yi <= 10^4
 */
class KClosestPointsToOrigin {

    PriorityQueue<Point> queue = new PriorityQueue<>();

    int[][] kClosest(int[][] points, int k) {
        if (k == 1 && points.length == 1) {
            return points;
        }

        for (int[] point : points) {
            queue.offer(new Point(point[0], point[1]));
            if(queue.size() > k) {
                queue.poll();
            }
        }

        return queue.stream()
                .map(point -> new int[]{point.x, point.y})
                .toArray(value -> new int [k][2]);

    }
}

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int calculateDistanceToOrigin() {
        return (x * x) + (y * y);
    }

    @Override
    public int compareTo(Point o) {
        return Integer.compare(o.calculateDistanceToOrigin(), this.calculateDistanceToOrigin());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}