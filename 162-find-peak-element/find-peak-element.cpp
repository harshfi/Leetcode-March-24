class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int l=0;
        int e=nums.size()-1;

        while(l<e){
            int m=(l+e)/2;

            if(nums[m]>nums[m+1]){
                e=m;
            }
            else{
                l=m+1;
            }
        }
        return e;
    }
};