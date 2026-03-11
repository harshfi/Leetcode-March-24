class Solution {
public:
    int findPeakElement(vector<int>& arr) {

        if(arr.size()==1)return 0;
        if(arr.size()==2)return arr[0]>arr[1]?0:1;
        if(arr[arr.size()-1]>arr[arr.size()-2])return arr.size()-1;
         int s=0;
        int e=arr.size()-1;
        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]<arr[mid+1])s=mid+1;
            else e=mid-1;
        }
        return s;
    }
};