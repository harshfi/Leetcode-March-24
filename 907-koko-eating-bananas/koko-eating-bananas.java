class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int s=1;
        int e= Integer.MAX_VALUE;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(find(piles,mid,h)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
    }
    public boolean find(int  arr[],int mid, int h){
       
       int sum=0;

       for(int i : arr){
        if(i%mid==0)sum+=(i/mid);
        else sum+=(i/mid)+1;
       }

       return sum<=h;

    }

}