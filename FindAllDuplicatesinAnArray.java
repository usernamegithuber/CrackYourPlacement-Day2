package CrackYourPlacementDay2;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinAnArray {
    static class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int ind = Math.abs(nums[i]) - 1;
                if (nums[ind] < 0) {
                    ls.add(Math.abs(nums[i]));
                } else {
                    nums[ind] = -nums[ind];
                }
            }
            return ls;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = solution.findDuplicates(nums);

        // Printing the result
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        // Output should be: 2 3
    }
}
