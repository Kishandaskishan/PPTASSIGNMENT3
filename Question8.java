package JavaAssignmentQ3;

import java.util.Arrays;

public class Question8 {
    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Check for overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i-1][1]) {
                return false; // Overlapping intervals, cannot attend all meetings
            }
        }

        return true; // No overlapping intervals, can attend all meetings
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean canAttend = canAttendMeetings(intervals);
        System.out.println("Can attend all meetings: " + canAttend);
    }
}
