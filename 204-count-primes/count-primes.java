class Solution {
    public int countPrimes(int n) {
        List<Integer> list = new ArrayList<>();
        int cnt=0;
        int arr[]= new int [(n)+2];
        for(int i=2;i<(n);i++){
            if(arr[i]==0){
                for(int j=2*i;j<=(n);j=j+i){
                    arr[j]=1;

                }
              cnt++;
            }
        }
        return cnt;
    }
}