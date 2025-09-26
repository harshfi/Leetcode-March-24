class Solution {
    public int triangleNumber(int[] arr) {
        Arrays.sort(arr);
      int cnt=0;
      List<Integer> list= new ArrayList<>();
      for(int i=0;i<arr.length;i++){
        if(arr[i]<=0) continue;
        for(int j=i+1;j<arr.length;j++){
             if(arr[j]<=0) continue;
           int sum=(arr[i]+arr[j]);
           for(int k=j+1;k<arr.length;k++){
            if(sum>arr[k])cnt++;
           }
        }
      }

     return cnt;

    }
}