package insertInterval;

// LeetCode Problem: Insert Interval
// Link: https://leetcode.com/problems/insert-interval/description/

/*
Problem Description:
You are given an array of non-overlapping intervals where intervals[i] = [starti, endi] represent
the start and the end of the ith interval and intervals is sorted in ascending order by starti.
You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti
and intervals still do not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Example 1:
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

Example 2:
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]

Constraints:
- 0 <= intervals.length <= 10^4
- intervals[i].length == 2
- 0 <= starti <= endi <= 10^5
- intervals is sorted by starti in ascending order
- newInterval.length == 2
- 0 <= start <= end <= 10^5
*/

class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        int[][] sortedIntervals = insertNewIntervalToSortedArray(intervals, newInterval);
        return getMergedIntervals(sortedIntervals);
    }

    private static int[][] getMergedIntervals(int[][] sortedIntervals) {
        int[][] mergedIntervals = new int[sortedIntervals.length][2];
        int mergedIntervalsIndex = 0;
        mergedIntervals[0] = sortedIntervals[0];
        for (int sortedIntervalsIndex = 1; sortedIntervalsIndex < sortedIntervals.length; sortedIntervalsIndex++) {
            if (mergedIntervals[mergedIntervalsIndex][1] < sortedIntervals[sortedIntervalsIndex][0]) {
                    mergedIntervals[mergedIntervalsIndex+1] = sortedIntervals[sortedIntervalsIndex];
                    mergedIntervalsIndex++;
            } else {
                int[] mergedInterval = new int[2];
                mergedInterval[0] = Math.min(sortedIntervals[sortedIntervalsIndex][0], mergedIntervals[mergedIntervalsIndex][0]);
                mergedInterval[1] = Math.max(sortedIntervals[sortedIntervalsIndex][1], mergedIntervals[mergedIntervalsIndex][1]);
                mergedIntervals[mergedIntervalsIndex] = mergedInterval;
            }
        }

        int[][] shortenedMergedIntervals = new int[mergedIntervalsIndex+1][2];
        System.arraycopy(mergedIntervals, 0, shortenedMergedIntervals, 0, shortenedMergedIntervals.length);
        return shortenedMergedIntervals;
    }

    private static int[][] insertNewIntervalToSortedArray(int[][] intervals, int[] newInterval) {
        int[][] sortedIntervals = new int[intervals.length + 1][2];
        int sortedIntervalsIndex = 0;
        if (intervals[0][0] > newInterval[0]) {
            sortedIntervals[sortedIntervalsIndex] = newInterval;
            sortedIntervalsIndex++;
        }
        sortedIntervals[sortedIntervalsIndex] = intervals[0];
        sortedIntervalsIndex++;

        for (int intervalsIncex = 1; intervalsIncex < intervals.length; intervalsIncex++) {
            if (intervalsIncex == sortedIntervalsIndex && (intervals[intervalsIncex][0] > newInterval[0])) {
                sortedIntervals[sortedIntervalsIndex] = newInterval;
                sortedIntervalsIndex++;
            }
            sortedIntervals[sortedIntervalsIndex] = intervals[intervalsIncex];
            sortedIntervalsIndex++;
        }
        if (sortedIntervalsIndex == intervals.length) {
            sortedIntervals[sortedIntervalsIndex] = newInterval;
        }
        return sortedIntervals;
    }
}

