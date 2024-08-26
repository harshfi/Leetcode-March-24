class Solution {
    public boolean isPalindrome(int x) {
       
        int rev = 0;
        int temp = x;

        if(rev < (Integer.MIN_VALUE)/10 || rev > (Integer.MAX_VALUE)/10){
            return false;
        }

        
        while(x>0){
            int rem = x % 10;
            rev = (rev*10) + rem ;
            x /= 10;
        }
       
        return rev==temp;
    }
}