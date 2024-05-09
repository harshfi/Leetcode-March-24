class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        int cnt=0;
        int i=h.length-1;
        long sum=0;
        while(k-->0){

            if(h[i]<=cnt) break;

            sum+=(long)(h[i--]-cnt);
            cnt++;
        }
        return sum;
        
    }
}