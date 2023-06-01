package JavaAssignmentQ3;

import java.util.Arrays;

public class Question1 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order

        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum as the sum of the first three numbers

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer to the element after nums[i]
            int right = nums.length - 1; // Pointer to the last element

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum; // Found exact sum, return it
                }

                // Update the closest sum if the current sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++; // Move the left pointer to increase the sum
                } else {
                    right--; // Move the right pointer to decrease the sum
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int closestSum = threeSumClosest(nums, target);
        System.out.println("Closest sum: " + closestSum);
    }
}
