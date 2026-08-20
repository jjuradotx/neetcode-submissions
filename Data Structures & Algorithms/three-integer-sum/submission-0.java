class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> target = new HashMap<>();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                int sum = nums[k] + nums[j];
                if (sum + currentNum == 0) {
                    ArrayList<Integer> temp = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));

                    if (!result.contains(temp)) {
                        result.add(temp);
                    }
                }

                if (sum + currentNum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }
}
