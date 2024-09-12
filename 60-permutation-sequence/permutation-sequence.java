class Solution {
    List<Integer> l;
    public String getPermutation(int n, int k) {
        l= new ArrayList<>();
        int a[]= new int [10];
        build(n,n,0,a);
        Collections.sort(l);
        return l.get(k-1)+"";
    }
    public  void build(int n,int no,int num,int a[]){
        if(n==0){
            l.add(num);
            return ;
        }
        for(int i=1;i<=no;i++){
            if(a[i]!=1){
                a[i]=1;
                build(n-1,no,num*10+i,a);
                a[i]=0;
            }
        }
    }
}