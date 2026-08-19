class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int longestSeq = 0;
        int currentSeq = 0;
        for (int n : set) {
            int prev = n - 1;
            if (set.contains(prev)) {
                continue;
            } else {
                int number = n;
                currentSeq = 0;
                while (set.contains(number)) {
                    currentSeq++;
                    number++;
                }
                if (currentSeq > longestSeq) {
                    longestSeq = currentSeq;
                }
                

            }
        }

        return longestSeq;
    }
}
