class Trie {

    class Node{
		char data;
		HashMap<Character,Node> child=new HashMap<>();
		boolean isTerminal;
		
	}
	
	private Node root;
	
	public Trie(){
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
    
    public boolean search(String word) {
       Node curr=root;
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
			
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				return false;
			}
		}
		return curr.isTerminal; 
    }
    
    public boolean startsWith(String word) {
        Node curr=root;
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
			
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				return false;
			}
		}
		return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */