class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb=lb(nums,target);
        int ub=ub(nums,target);
        int arr[]= new int[2];
        arr[0]=lb;
        arr[1]=ub;
        return arr;
    }
    public int ub(int []nums, int target){
        int i=0, j=nums.length-1;
       int ans=-1;
       while(i<=j){
          int mid=(i+j)/2;
          if(nums[mid]<=target){
            if(nums[mid]==target) ans=mid;
           
            i=mid+1;
          }
          else j=mid-1;
       }
       return ans;
    }
    public int lb(int[] nums, int target){
       
       int i=0, j=nums.length-1;
       int ans=-1;
       while(i<=j){
          int mid=(i+j)/2;
          if(nums[mid]>=target){
            if(nums[mid]==target) ans=mid;
           
            j=mid-1;
          }
          else i=mid+1;
       }
       return ans;
    }
}