class Solution {
    public int maxArea(int[] heights) {
        int size = heights.length;

        int start = 0;
        int end = size - 1;
        int area = 0;

        while (start < end) {
            int left = heights[start];
            int right = heights[end];
            int difference = end - start;
            int height = Math.min(left, right);
            area = Math.max(area, height * difference);

            if (left < right) {
                start++;
            } else {
                end--;
            }
        }

        return area;
    }
}
