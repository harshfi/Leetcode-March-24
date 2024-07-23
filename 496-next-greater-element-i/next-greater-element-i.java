class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int ng[]=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() &&nums2[st.peek()]<nums2[i]){
                int idx=st.pop();
                ng[idx]=nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int idx=st.pop();
            ng[idx]=-1;
        }
        int ans[]=new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                  ans[i]=ng[j];
                }
            }
        }
        return ans;

       
    }
}