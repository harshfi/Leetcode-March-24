class Solution {
    public int[] nextGreaterElements(int[] nums2) {
         Stack<Integer> st=new Stack<>();
        int ng[]=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() &&nums2[st.peek()]<nums2[i]){
                int idx=st.pop();
                ng[idx]=nums2[i];
            }
            st.push(i);
        }
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() &&nums2[st.peek()]<nums2[i]){
                int idx=st.pop();
                ng[idx]=nums2[i];
            }
            // st.push(i);
        }
        while(!st.isEmpty()){
            int idx=st.pop();
            ng[idx]=-1;
        }
        return ng;
    }
}