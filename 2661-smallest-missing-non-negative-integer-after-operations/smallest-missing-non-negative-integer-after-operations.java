class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            int mod = ((i % value) + value) % value; 
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        for (int i = 0; ; i++) {
            int mod = i % value;
            if (!map.containsKey(mod)) return i;
            if (map.get(mod) == 1) map.remove(mod);
            else map.put(mod, map.get(mod) - 1);
        }
    }
}
