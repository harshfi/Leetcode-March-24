class Solution {
    public int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);

        while(true){
            boolean f=find(original,nums);

            if(f)original=original*2;

            else return original;
        }

       
    }

    public boolean find(int target,int nums[]){

     int i=0;
     int j=nums.length-1;

     while(i<=j){
        int mid=(i+j)/2;

        if(nums[mid]==target){
            return true;
        }
        else if(nums[mid]>target){
           j=mid-1;
        }
        else i=mid+1;
     }
     return false;

    }
}