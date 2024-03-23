class Solution {
    public int findMin(int[] nums) {
        int s=0,e=nums.length-1;
        while(s<e){
            int m= s+(e-s)/2;
            if(nums[m]==nums[s]&&nums[m]==nums[e]){
                e--;
                s++;
            }
            else if(nums[m]<=nums[e]) e=m;
            else s=m+1;
        }
        return nums[s];
    }
}