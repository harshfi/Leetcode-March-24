class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" "); 
        
        String ans="";
        for(int i=words.length-1;i>=0;i--){
            if(!words[i].equals(" "))
              ans+=words[i]+" ";
        }
        // System.out.println( );
      return ans.replaceAll("\\s+", " ").trim();
        
    }
}