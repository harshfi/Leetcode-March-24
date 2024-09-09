class Solution {
    public int removeDuplicates(int[] nums) {
       
      int idx=0;
      for(int i=0;i<nums.length;){
        int j=i;
        while(j<nums.length && nums[i] ==nums[j]){
            j++;
        }
        nums[idx++]=nums[i];
        i=j;
      }

        return idx;
    }
}