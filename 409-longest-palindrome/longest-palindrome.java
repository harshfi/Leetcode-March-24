class Solution {
    public int longestPalindrome(String s) {
        int a[]=new int[124];
        for(int i=0;i<s.length();i++){
            a[(int)s.charAt(i)]++;
        }
        int odd=0;
        int len=0;
        for(int i=65;i<124;i++){
           if(a[i]%2==0){
            len+=a[i];
           }
           else if(a[i]%2!=0 && odd==0){
            len+=a[i];
            odd++;
           }
           else len+=(a[i]-1);
        }
        return len;

    }
}