class Solution {
    public int[] dailyTemperatures(int[] nums2) {
          Stack<Integer> st=new Stack<>();
         int ng[]=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() &&nums2[st.peek()]<nums2[i]){
                int idx=st.pop();
                ng[idx]=i-idx;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int idx=st.pop();
            ng[idx]=0;
        }
        return ng;
    }
}