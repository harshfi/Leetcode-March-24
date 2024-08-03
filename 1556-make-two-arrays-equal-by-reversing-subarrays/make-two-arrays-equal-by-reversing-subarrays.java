class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // Set<Integer> set= new HashSet<>();
        int a1[]=new int[1001];
        int a2[]=new int[1001];
        for(int i=0;i<target.length;i++){
            a1[(target[i])]++;
            a2[(arr[i])]++;
        }
        for(int i=0;i<=1000;i++)if(a1[i]!=a2[i])return false;
        return true;
    }
}