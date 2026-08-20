class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(numbers[i])) {
                break;
            }

            map.put(complement, i + 1);
        }

        return new int[] {map.get(numbers[i]), i + 1};
    }
}
