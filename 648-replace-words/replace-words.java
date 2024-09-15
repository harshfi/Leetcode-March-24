class Solution {
    class Node{
		char data;
		HashMap<Character,Node> child=new HashMap<>();
		boolean isTerminal;
		
	}
	
	private Node root;
	
	public Solution(){
		Node n= new Node();
		root=n;
		n.data='*';
		n.isTerminal=false;
	}
	
	public void insert(String word) {
		
		Node curr=root;
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
			
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				Node n=new Node();
				n.data=ch;
				curr.child.put(ch,n);
				curr=n;
			}
		}
		curr.isTerminal=true;
	}
	
	public int Search(String word) {
		Node curr=root;
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
			
            if(curr.isTerminal) return i;
			if(curr.child.containsKey(ch)) {
                // System.out.println("hi");
				curr=curr.child.get(ch);
			}
			else {
				return word.length();
			}
		}
		return word.length();
	}
	
    public String replaceWords(List<String> d, String st) {
        String s[]=st.split(" ");
        String str="";
        
        for(String  i : d) insert(i);
        for(String i : s){
            int l=Search(i);
            // System.out.println(i+" "+l);
            str=str+i.substring(0,l)+" "; 
        }
        return str.trim();
    }
}