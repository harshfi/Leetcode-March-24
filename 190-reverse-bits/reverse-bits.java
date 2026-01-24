class Solution {
    public int reverseBits(int n) {
         int ans=0;
        for(int i=0;i<=31;i++){
            ans=ans<<1;
            if((n&1)>0){
                ans=ans|1;
            }
            n=n>>1;
        }
        return ans;
    }
}