class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt=0;

        for(int i=0;i<strs[0].length();i++){
            int prev=97;
            for(int j=0;j<strs.length;j++){
               
               if(prev> strs[j].charAt(i)){
                cnt++;
                break;
               }
               prev= (int)strs[j].charAt(i);
            }
        }
        return cnt;
    }
}