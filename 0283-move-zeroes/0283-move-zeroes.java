class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0; 
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                nums[count] = nums[r];
                count++;
            }
        }
        
        // 2. Fill the rest of the array with zeroes
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }
}
