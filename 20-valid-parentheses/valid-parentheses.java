class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{'||ch=='[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if(ch==')'){
                    char poppedCh=st.pop();
                    if(poppedCh!='(') return false;
                }
                if(ch=='}'){
                    char poppedCh=st.pop();
                    if(poppedCh!='{') return false;
                }
                if(ch==']'){
                    char poppedCh=st.pop();
                    if(poppedCh!='[') return false;
                }
            }
        }
        return st.size()==0;

    }
}