class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[ans]<arr[i])ans=i;
        }
        return ans;
    }
}