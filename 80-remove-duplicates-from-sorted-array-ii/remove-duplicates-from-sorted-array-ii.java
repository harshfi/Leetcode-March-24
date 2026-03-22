class Solution {
    public int removeDuplicates(int[] nums) {
       int idx=1;
       for(int i=2;i<nums.length;i++ ){
         
         if(nums[idx]==nums[i] && nums[idx-1]==nums[i])continue;

            idx++;
            nums[idx]=nums[i];

       } 
       return  idx+1;
    }
}