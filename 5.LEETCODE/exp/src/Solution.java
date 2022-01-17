class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for (int i = 0, len = nums.length; i < len; ++i) {
            if (nums[i] != 0) {
                nums[l++] = nums[i];
            }
        }

        for (int i = l, len = nums.length; i < len; ++i) {
            nums[i] = 0;
        }
    }
}