class Solution {
 	public static  boolean isIdealPermutation(int[] nums) {
        int cnt=0;
        int prev=nums[0];
        for (int i = 1; i < nums.length; i++) {
		     if(prev>nums[i])cnt++;
		     prev=nums[i];
		}
        int cntg=0;
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
        	
        	int idx=lowerBound(l , nums[i]);
        	cntg+=nums[i]-idx;
        	l.add(idx, nums[i]);
//        	System.out.println(l);
		}
        return cnt==cntg;
    }
	public static int lowerBound(List<Integer> l, int x) {
		int low = 0, high = l.size() - 1;
		int ans = l.size();
//		List<Integer> l=new ArrayList<>(set);
		while (low <= high) {
			int mid = (low + high) / 2;
			// maybe an answer
			if (l.get(mid) >= x) {
				ans = mid;
				//look for smaller index on the left
				high = mid - 1;
			} else {
				low = mid + 1; // look on the right
			}
		}
		return ans;
	}

}