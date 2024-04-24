class Solution {
    public int tribonacci(int n) {

        int t0=0;
        int t1=1;
        int t2=1;
       

        for(int i=3;i<=n;i++){
            int temp1=t0+t1+t2;
            t0=t1;//
            t1=t2;
            t2=temp1;
        }
        return n==0?t0:n==1?t1:t2;
        
    }
}