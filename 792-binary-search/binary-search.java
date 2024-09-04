class Solution {
    public int search(int[] a, int t) {
        int start=0;
		int end = a.length-1;//index
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]== t) {
				return mid;
			}
			else if(a[mid]>t)end=mid-1;
			else start=mid+1;
		}
		
        return -1;

    }
}