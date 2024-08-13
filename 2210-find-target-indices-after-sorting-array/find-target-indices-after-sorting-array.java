class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
       List<Integer> list= new ArrayList<>();
       int start=LowerBound(nums,target);
       int end=UpperBound(nums,target);
    //    System.out.println(start+" "+end);
       for(int i=start;i<=end && i>=0;i++)
           list.add(i);

        return list;
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