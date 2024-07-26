class Solution {
    List<String> list;
    public List<String> generateParenthesis(int n) {
        list= new ArrayList<>();
        par(n,0,0,"");
        return list;
        
    }
    public  void par(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			list.add(ans);
			return;
		}
		if(open>n || close > n) return;
		
		if(open<n)
		par(n,open+1,close,ans+"(");
		if(close<open)
		par(n,open,close+1,ans+")");
	}
}