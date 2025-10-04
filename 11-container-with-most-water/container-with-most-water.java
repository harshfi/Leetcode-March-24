class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length - 1;
        int max = 0;

        while (left < right) {
            int height = Math.min(h[left], h[right]);
            int width = right - left;
            max = Math.max(max, height * width);

            // Move the pointer with smaller height inward
            if (h[left] < h[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
