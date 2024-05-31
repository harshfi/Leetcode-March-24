class Solution {
    public int[] singleNumber(int[] nums) {

        int res=0;

        for( int i: nums) res=res^i;

        //find the set bit number
        int x=1;

        while((res&x)==0){
            x<<=1;
        }
       int a[]=new int[2];
        for(int i : nums){
            if((i & x) ==0) a[0]=a[0]^i;
        }
        a[1]=res^a[0];
        return a;
        
    }
}