class Solution {
    public int repeatedNTimes(int[] nums) {
        int cnt=1;
        int prev=nums[0];
        int num=nums[1];


        for(int i=2;i<nums.length;i++){
            if(num==nums[i] || prev == nums[i]){
                return nums[i];
            }

            else{
                prev=num;
                num=nums[i];
            }
        }
        return num;
    }
}