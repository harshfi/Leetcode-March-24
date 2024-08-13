class Solution {
    public int mySqrt(int x) {
       if(x==0) return 0;
        long s=1;
        long e=x;
        long mid=0;
        while(s<=e)
        {
           mid = (s+e)/2;
            if((mid*mid)==x) return(int) mid;
            else if((mid*mid)>x) e=mid-1;
            else s=mid+1;
        }
        return(int) e;
    }
}