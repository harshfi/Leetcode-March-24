class Solution {
    public char findTheDifference(String s, String t) {
       char c = 0;
        s += t;
        for(char ch: s.toCharArray()) {
            c ^= ch;
        }
        return c;
        
    }
}