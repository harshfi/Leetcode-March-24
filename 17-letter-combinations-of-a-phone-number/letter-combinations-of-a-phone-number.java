class Solution {
    static List<String> list;
	public static List<String> letterCombinations(String digit) {
		list=new ArrayList<>();
        if(digit.length()==0) return list;
		String arr[]={"","","abc","def","ghi",
		              "jkl","mno","pqrs","tuv","wxyz"};
		find("",0,arr,digit);
		return list;
	}
	public static void find(String ans,
			int idx,String arr[],String digit) {
		if(ans.length()==digit.length()) {
			list.add(ans);
			return;
		}
		int d= digit.charAt(idx)-'0';
		String s= arr[d];
		for (int i = 0; i < s.length(); i++) {
			find(ans+s.charAt(i),idx+1,arr,digit);
		}
	}

}