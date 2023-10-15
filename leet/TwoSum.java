class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int index = -1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    index = j; 
                    break; 
                }
            }
            if (index != -1) {
                return new int[]{i, index}; 
            }
        }
        return new int[0];
    }
}