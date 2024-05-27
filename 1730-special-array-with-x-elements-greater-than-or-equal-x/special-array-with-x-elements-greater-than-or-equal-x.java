class Solution {
  public static  int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int idx=0;
        int i;
        for ( i = 1; i <=1000; i++) {
			
			while(idx<n && nums[idx]<i)idx++;
            if(idx==nums.length) {
				break;
			}
			if(nums[idx]>=i && (n-idx)==i )return i;
			
		}
        return -1;
    }
}