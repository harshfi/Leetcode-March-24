class Solution {
    public int[] plusOne(int[] digits) {

        if(digits[digits.length-1]!=9){
            digits[digits.length-1]= digits[digits.length-1]+1;
            return digits;
        }
        int carry=1;
        digits[digits.length-1]= 0;
        for(int i=digits.length-2;i>=0;i--){
       if(digits[i]!=9){
            digits[i]= digits[i]+1;
            return digits;
        }
        else{
            digits[i]=0;
        }
        }
        int arr[]= new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}