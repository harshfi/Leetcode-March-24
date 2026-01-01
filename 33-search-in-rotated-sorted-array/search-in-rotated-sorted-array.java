class Solution {
    public int search(int[] nums, int target) {
        
        int idx=peek(nums);
        int ans=search(target,nums,0,idx);
        System.out.println(ans+" "+idx);
        if(ans!=-1)return ans;
        else return search(target,nums,idx+1,nums.length-1);
     
        
    }
    public int search(int target, int nums[], int i, int j){
         
        while(i<=j){
             int mid=(i+j)/2;

             if(nums[mid]==target){
                return mid;
             }
             else if(nums[mid]<target){
                i=mid+1;
             }
             else{
               j=mid-1;
             }
        
        }
        return -1;
    }
    public int peek(int nums[]){
        // 
        int i = 0, j = nums.length - 1;

    while (i < j) {
        int mid = (i + j) / 2;

        if (nums[mid] > nums[j]) {
            i = mid + 1;
        } else {
            j = mid;
        }
    }
    return (i - 1 + nums.length) % nums.length;
    }
}