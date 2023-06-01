package JavaAssignmentQ3;

import java.util.Arrays;

public class Question3 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the first pair where nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            // Find the smallest element greater than nums[i] in the subarray nums[i:]
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Reverse the subarray nums[i+1:]
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
