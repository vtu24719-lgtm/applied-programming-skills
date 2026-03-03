class Solution {
    public void moveZeroes(int[] nums) {
        // pointer for position to place the next non-zero
        int j = 0;

        // first pass: move all non-zeros forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j] if they are different
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
