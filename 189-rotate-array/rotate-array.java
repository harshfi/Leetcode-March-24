class Solution {
    public void rotate(int[] nums, int k) {
      k=k%nums.length;
      int n=nums.length;
      int arr[]= new int [nums.length];
      for(int i=0;i<nums.length;i++){
        arr[(k+i)%n]=nums[i];
      }
     
     for(int i=0;i<n;i++) nums[i]=arr[i];
        
    }
}