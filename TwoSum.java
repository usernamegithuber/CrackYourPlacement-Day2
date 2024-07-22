package CrackYourPlacementDay2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSumOptimal(int[] nums, int target) {
        // Create a hash map to store the value and its corresponding index
        Map<Integer, Integer> hs = new HashMap<>();
        int[] ans = new int[2];

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the complement (target - current number) exists in the map
            if (hs.containsKey(target - nums[i])) {
                // If found, store the indices in the answer array
                ans[0] = i;
                ans[1] = hs.get(target - nums[i]);
                // Return the answer array immediately
                return ans;
            }
            // Store the current number and its index in the map
            hs.put(nums[i], i);
        }

        // This line should never be reached as per the problem statement (exactly one solution)
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSumOptimal method and get the result
        int[] result = twoSumOptimal(nums, target);

        // Print the result
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
        } else {
            System.out.println("No solution found.");
        }
    }
}

