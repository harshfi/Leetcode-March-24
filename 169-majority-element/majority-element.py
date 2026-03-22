class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        ele=nums[0]
        count=1
        for i in nums:
            if i == ele : count=count+1
            else : count=count-1

            if count==0: 
                ele=i
                count=1

        
        return ele
            