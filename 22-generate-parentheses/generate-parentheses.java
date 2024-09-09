class Solution {
    static List<String> l;
    public List<String> generateParenthesis(int n) {
        l= new ArrayList<>();
        genrate(n,0,0,"");
        return l;
    }
    public static void genrate(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			l.add(ans);
			return;
		}
		
		if(open> n || close >n)return;
		
		//  (
		
		if(open<n)
		genrate(n,open+1,close, ans+"(");
		//  )
		
		if(close<open)
		genrate(n,open,close+1,ans+")");
	}

}