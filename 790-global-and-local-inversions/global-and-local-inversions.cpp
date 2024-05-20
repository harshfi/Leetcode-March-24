class Solution {
public:
  bool isIdealPermutation(const std::vector<int>& nums) {
    int cnt = 0;
    int prev = nums[0];
    for (size_t i = 1; i < nums.size(); ++i) {
        if (prev > nums[i]) cnt++;
        prev = nums[i];
    }
    
    long long cntg = 0; 
    std::vector<int> l;
    for (size_t i = 0; i < nums.size(); ++i) {
        auto it = std::lower_bound(l.begin(), l.end(), nums[i]);
        int idx = it - l.begin();
        cntg += static_cast<long long>(nums[i]) - idx;
        if(cntg>cnt)return false;
        l.insert(it, nums[i]);
    }
    
    return cnt == cntg;
}
};