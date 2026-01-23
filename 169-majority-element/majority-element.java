class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){

            if(a==nums[i])cnt++;
            else cnt--;
            if(cnt==0){
                a=nums[i];
                cnt=1;
            }
        }
        return a;
    }
}