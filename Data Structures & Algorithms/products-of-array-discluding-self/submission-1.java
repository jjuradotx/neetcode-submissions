class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsSize = nums.length;
        int[] result = new int[numsSize];
        int product = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[numsSize];
        }

        for (int i = 0; i < numsSize; i++){
            int currNum = nums[i];
            if (zeroCount > 0) {
                if (currNum == 0) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            } else {
                result[i] = product / currNum;
            } 
        }
        
        return result;
    }
}  
