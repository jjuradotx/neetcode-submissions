class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int current = nums[i];

            int complement = target - current;

            if (map.containsKey(current)) {
                return new int[]{map.get(current), i};
            }
            
            map.put(complement, i);
        }

        return new int[]{};

    }
}
