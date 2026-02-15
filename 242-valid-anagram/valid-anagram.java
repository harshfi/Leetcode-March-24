class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
         
         for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            arr[idx]++;
         }

         for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            arr[idx]--;
         }

         for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)return false;
         }
         return true;

    }
}