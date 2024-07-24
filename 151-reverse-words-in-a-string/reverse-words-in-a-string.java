class Solution {
    public String reverseWords(String s) {
        String words[]= s.split(" ");
        String ans="";
        for(int i=words.length-1;i>=0;i--){
           ans+=words[i]+" ";
        }
        return ans.replaceAll("\\s+"," ").trim();
        
    }
}