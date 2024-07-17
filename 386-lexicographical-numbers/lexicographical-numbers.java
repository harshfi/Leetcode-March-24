class Solution {
    List<Integer> list;
    public List<Integer> lexicalOrder(int n) {
        list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            find(i,n);
        }
        return list;
    }
    public  void find(int num,int n){
        if(num>n)return;
        list.add(num);
        num=num*10;
        for(int i=0;i<=9;i++){
            find(num+i,n);
        }
    }
}