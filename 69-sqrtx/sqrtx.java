class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int s=1;
		int e=x;
		while(s<=e) {
			long mid=s+(e-s)/2;
			
			if(mid*mid==x)return (int)mid;
			
			else if(mid*mid>x) e=(int)mid-1;
			
			else s=(int)mid+1;
			
//			System.out.println(s+" "+e);
		}
		return e;
    }
}