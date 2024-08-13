class Solution {
    public int minimumSize(int[] nums, int o) {
        int i=1;
        int e=1000000000;
        int ans=0;
        while(i<=e){
            int mid=(i)+(e-i)/2;

            if(check(mid,o,nums)){
                ans=mid;
                e=mid-1;
            }
            else i=mid+1;
        }
        return ans;

    }
    public static boolean check(int mid,int o, int nums[]){

        for(int i=0;i<nums.length;i++){
               o-=nums[i]/mid;
               if(nums[i]%mid==0)o++;
        }
        return o>=0?true:false;
    }
}