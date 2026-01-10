class Solution {
    public int splitArray(int[] arr, int k) {
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }

        int i=max;
        int j=sum;
        int ans=sum;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(isCorrect(arr,mid,k)){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean isCorrect(int []arr,int mid,int k){
        int count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                sum=arr[i];
                count++;
            }
        }
        return count<=k;
    }
}