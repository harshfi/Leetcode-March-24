class Solution {
    public int maxScore(int[] a, int k) {
        int sum=0;
        int i=0;
        for( i=0;i<k;i++) sum+= a[i];

       int ans=sum;
       i--;
       int idx=a.length-1;
       for(int j=i;j>=0;j--){
          sum=sum - a[j] +a[idx--];
          ans=Math.max(ans,sum);
       }
      

        return ans;
    }
}