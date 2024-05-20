class Solution {
    int total=0;
    public int subsetXORSum(int[] nums) {
      total=0;
      find(nums,0,0);
      return total;
    }
    public  void find(int nums[],int i, int sum){
        if(i>=nums.length){
            this.total+=sum;
            return;
        }
        find(nums,i+1,sum^nums[i]);
        find(nums,i+1,sum);
    }
}