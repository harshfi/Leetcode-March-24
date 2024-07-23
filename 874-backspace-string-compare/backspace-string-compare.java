class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1= new Stack<>();
         Stack<Character> st2= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && !st1.isEmpty() ){
                st1.pop();
            }
            else if(s.charAt(i)!='#')st1.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' && !st2.isEmpty() ){
                st2.pop();
            }
            else if(t.charAt(i)!='#')st2.push(t.charAt(i));
        }
        if(st1.size()!=st2.size()) return false;

        while(!st1.isEmpty()){
            char ch1=st1.pop();
            char ch2=st2.pop();
            if(ch1!=ch2)return false;
        }
        return true;
        
    }
}