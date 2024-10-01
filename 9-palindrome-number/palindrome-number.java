class Solution {
    public boolean isPalindrome(int n) {
        
       int temp=n;
		int rev=0;
		while(temp>0) {
			int d=temp%10;
		    rev=(rev*10)+d;
		    temp=temp/10;
		}
		if(n==rev) return true;
		else return false;

    }
}