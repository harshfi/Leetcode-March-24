class Solution {
    public int shipWithinDays(int[] w, int days) {
        
       int i = 0, j = 0;
for (int x : w) {
    i = Math.max(i, x); // minimum capacity
    j += x;             // maximum capacity
}

       int ans=0;
       while(i<=j){

        int mid=(i+j)/2;
        
        if(find(w,mid,days)){
            ans=mid;
            j=mid-1;
        }
        else i=mid+1;

       }
      return ans;
    }
    public boolean find(int w[], int mid, int days ){
        int curr=0;
        int no=1;

        for(int i: w){

            if(i+curr>mid){
                no++;
                curr=0;
            }
            curr+=i;
        }
        return no<=days;
         


    }
}