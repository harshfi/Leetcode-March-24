class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length;i++) st.push(s[i]);

        int i=0;

        while(!st.isEmpty()){
            s[i]=st.pop();
              i++;
        }
    }
}