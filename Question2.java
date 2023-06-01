package JavaAssignmentQ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(nums); // Sort the array in ascending order

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates
                }

                int left = j + 1; // Pointer to the element after nums[j]
                int right = n - 1; // Pointer to the last element

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++; // Skip duplicates
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--; // Skip duplicates
                        }
                    } else if (sum < target) {
                        left++; // Move the left pointer to increase the sum
                    } else {
                        right--; // Move the right pointer to decrease the sum
                    }
                }
            }
        }

        return quadruplets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> quadruplets = fourSum(nums, target);
        System.out.println("Quadruplets:");
        for (List<Integer> quad : quadruplets) {
            System.out.println(quad);
        }
    }
}
	