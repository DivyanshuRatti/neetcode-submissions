class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int l = 0; l < nums.length; l++) {
            for (int r = l + 1; r < nums.length; r++) {
                if (nums[l] + nums[r] == target) {
                    return new int[] {l, r};
                }
            }
        }


        return new int[] {0, 0};
    }
}