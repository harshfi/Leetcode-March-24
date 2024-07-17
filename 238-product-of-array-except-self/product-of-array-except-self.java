class Solution {
    public int[] productExceptSelf(int[] a) {
       int n=a.length;
		int left[]=new int [n];
		int right[]=new int [n];
		int ans[]=new int [n];
		int pro=1;
		for (int i = 0; i < right.length; i++) {
			left[i]=pro;
			pro=(pro*a[i]);
		}
		pro=1;
		for (int i = n-1; i >=0; i--) {
			right[i]=pro;
			pro=pro*a[i];
		}
		for (int i = 0; i < ans.length; i++) {
			ans[i]=left[i]*right[i];
		}
		return ans;
		
    }
}