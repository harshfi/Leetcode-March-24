class Solution {
    public List<Integer> countSmaller(int[] nums) {

        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int idx = find(list, nums[i]);
            list.add(idx, nums[i]);   // insert in sorted order
            ans.add(idx);             // count of smaller elements
        }

        Collections.reverse(ans);
        return ans;
    }

    public static int find(List<Integer> list, int val) {
        int idx = Collections.binarySearch(list, val);
        if (idx < 0) return -idx - 1;
        int l = 0, r = list.size();
    while (l < r) {
        int mid = l + (r - l) / 2;
        if (list.get(mid) < val) {
            l = mid + 1;
        } else {
            r = mid;
        }
    }
    return l;
    }
}
