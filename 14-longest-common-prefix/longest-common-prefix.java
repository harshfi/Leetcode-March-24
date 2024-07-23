class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            
            for(int j=0;j<strs[i].length() && j<ans.length();j++){
                if(ans.charAt(j)!= strs[i].charAt(j)){
                    ans=ans.substring(0,j);
                    break;
                }
            }
            ans= strs[i].length()<ans.length()?strs[i]:ans;
        }
        return ans;
    }
}