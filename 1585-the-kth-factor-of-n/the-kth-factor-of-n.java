class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> l= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0)l.add(i);
        }
        if(l.size()<k) return -1;
        return l.get(k-1);
    }
}