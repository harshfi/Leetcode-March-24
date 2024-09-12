class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> l= new ArrayList<>();
        int top=0;
        int bottom= a.length-1;
        int left=0;
        int right=a[0].length-1;
        System.out.println(top+" "+bottom+" "+left+" "+right);
        while( top<=bottom && left<= right){
            
            for(int i=left;i<=right;i++){
                l.add(a[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(a[i][right]);
            }
            right--;
            if(top<=bottom){
               for(int i=right;i>=left;i--){
                l.add(a[bottom][i]);
            }
            }
            
            bottom--;
            if(left<=right){
           
            for(int i=bottom ; i>=top;i--){
                l.add(a[i][left]);
               
            }

            left++;
            }
        }
        return l;
    }
}