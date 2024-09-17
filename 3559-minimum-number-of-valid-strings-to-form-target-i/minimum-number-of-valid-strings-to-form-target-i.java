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
//		System.out.println(curr+" "+word);
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
//			 for(char c : curr.child.keySet())System.out.println(curr.data+" "+c);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				Node n=new Node();
				n.data=ch;
				curr.child.put(ch,n);
				curr=n;
//				System.out.print(word+" "+ch+" ");
			}
			
		}
//		System.out.println();
		curr.isTerminal=true;
	}
	
	public void  Search(String word,int start,int dp[]) {
//		System.out.println(word);
		Node curr=root;
		for (int i = start; i < word.length(); i++) {
			char ch= word.charAt(i);
//		    for(char c : curr.child.keySet())System.out.println(curr.data+" "+c);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				return ;
			}
			dp[i+1]=Math.min(dp[i+1], dp[start]+1);
			
		}
		
		return ;
	}

   

    // Main logic to calculate minimum valid strings
    public static int minValidStrings(String[] words, String target) {
        int dp[] = new int[target.length() + 1]; // Adjust the size of dp array to target length
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Initialize dp[0] to 0
         
        Solution t= new Solution();
        // Insert all words into the Trie
        for (String word : words) {
            t.insert(word);
        }

        // Search the Trie for all substrings of target
        for (int i = 0; i < target.length(); i++) {
        	
        	if(dp[i]!=Integer.MAX_VALUE)
              t.Search(target, i, dp);
        }
        

        return dp[target.length()] == Integer.MAX_VALUE ? -1 : dp[target.length()];
    }
}