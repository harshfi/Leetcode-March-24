class Solution {
    public char findTheDifference(String s, String t) {
        int a[]=new int[26];
        int b[]=new int [26];

        for(int i=0;i<s.length();i++){
            a[(int)(s.charAt(i)-'a')]++;
            b[(int)(t.charAt(i)-'a')]++;
        }
        b[(int)(t.charAt(s.length())-'a')]++;

        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return (char)(i+97);
        }
        return ' ';
        
    }
}