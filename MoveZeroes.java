package CrackYourPlacementDay2;

public class MoveZeroes {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int ind = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    continue;
                }
                nums[ind++] = nums[i];
            }

            for (int i = ind; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);

        // Printing the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output should be: 1 3 12 0 0
    }
}
