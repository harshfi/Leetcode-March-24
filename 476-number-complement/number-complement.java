class Solution {
    public int findComplement(int num) {
        int temp=num;
        int mul=1;
        int sum=0;
        while(temp>0){
            if(temp%2==0) sum+=mul;
            mul*=2;
            temp/=2;
        }
        return sum;

    }
}