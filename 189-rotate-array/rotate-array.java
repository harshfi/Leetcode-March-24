class Solution {
    public void rotate(int[] nums, int k) {
      k=k%nums.length;
      int n=nums.length;
     
      reverse(0,n-1,nums);
      reverse(0,k-1,nums);
      reverse(k,n-1,nums);
     
    
        
    }
    public static void reverse(int i, int j, int[] arr){
        while(i<=j){
            int t= arr[i];
            arr[i]= arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}