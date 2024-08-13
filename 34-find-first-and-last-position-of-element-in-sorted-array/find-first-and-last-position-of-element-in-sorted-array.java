class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]= new int[2];
        a[0]=LowerBound(nums,target);
        a[1]=UpperBound(nums,target);
        return a;
    }
    public static int LowerBound(int nums[], int target){
        // if(nums.length>=1 && nums[0]>target) return -1;

        int i=0,e=nums.length-1;
        int ans=-1;
        while(i<=e){
            int mid=i+(e-i)/2;

            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]> target) e=mid-1;
            else i= mid+1;
        }
        return ans;
    }
    public static int UpperBound(int nums[], int target){
        // if(nums.length>=1 &&nums[nums.length-1]<target) return -1;

        int i=0,e=nums.length-1;
        int ans=-1;
        while(i<=e){
            int mid=i+(e-i)/2;

            if(nums[mid]==target){
                ans=mid;
                i=mid+1;
            }
            else if(nums[mid]> target) e=mid-1;
            else i= mid+1;
        }
        return ans;
    }
}