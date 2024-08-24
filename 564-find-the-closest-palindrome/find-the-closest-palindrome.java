class Solution {
    public static String nearestPalindromic(String n) {
		long ans=0;
		long x=Long.parseLong(n);
		
		long a1=binarySearchL(x);
		long a2=binarySearchH(x);
		
//		System.out.println(a1+" "+a2);
		
		
		
		
				
		
		
		
		
		return Math.abs(a2-x)>=Math.abs(a1-x) ? a1+"":a2+"";
       
	}
	
	static long palin(long x) {
		String s= Long.toString(x);
		int n= s.length();
		int l= (n-1)/2,r=n/2;
		char ch[]= s.toCharArray();
		while(l>=0) ch[r++]=ch[l--];
		
		return Long.parseLong(new String(ch));
	}
	
	static long binarySearchL(long x) {
		long s=0, e=x;
		long ans=-1;
		
		while(s<=e) {
			long mid= s+(e-s)/2;
			
			long palin=palin(mid);
			if(palin<x)  {
				
				ans=palin;
				s=mid+1;
			}
			
			else e=mid-1;
			
		}
		return ans;
	}
	
	static long binarySearchH(long x) {
		long s=x, e=(long) 1e18;
		long ans=0;
		
		while(s<=e) {
			long mid= s+(e-s)/2;
			long palin=palin(mid);
			if(palin>x) {
				
				ans=palin;
				e=mid-1;
			}
			
			else s=mid+1;
			
		}
		return ans;
	}
}