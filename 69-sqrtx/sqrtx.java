class Solution {
    public int mySqrt(int x) {
        long s=1;
	    long e=x;
	    while(s<=e) {
	    	long mid=(s+e)/2;
	    	if(mid*mid==x) return (int)mid;
	    	else if(mid*mid>x) e=mid-1;
	    	else s=mid+1;
	    }
	    return (int)e;
    }
}