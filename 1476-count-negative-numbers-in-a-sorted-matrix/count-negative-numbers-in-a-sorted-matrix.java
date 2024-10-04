class Solution {
    public int countNegatives(int[][] a) {
        int count=0;
		for (int row = 0; row < a.length; row++) {
			int idxNeg= find(a[row]);
			count=count+(a[row].length-idxNeg);
		}
        return count;
    }
    public static int find(int []arr) {
		if(arr[0]<0) return 0;
		int ans=arr.length;
		int s=0;
		int e= arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]<0) {
				ans=mid;
				e=mid-1;
			}
			else s=mid+1;
		}
		return ans;
	}
}