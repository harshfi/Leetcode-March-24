import java.util.*;

public class Solution {
    
    class Trie {
        class Node {
            HashMap<Character, Node> children = new HashMap<>();
            boolean isTerminal;
            
            public Node() {
                this.isTerminal = false;
            }
        }
        
        private Node root;
        
        public Trie() {
            root = new Node();
        }
        
        // Insert a word into the Trie
        public void insert(String word) {
            Node currentNode = root;
            for (char ch : word.toCharArray()) {
                currentNode.children.putIfAbsent(ch, new Node());
                currentNode = currentNode.children.get(ch);
            }
            currentNode.isTerminal = true; // Mark the end of a valid word
        }
        
        // Check for prefixes and update the dp array
        public void findPrefixes(String target, int start, int[] dp) {
            Node currentNode = root;
            for (int i = start; i < target.length(); i++) {
                char ch = target.charAt(i);
                
                if (!currentNode.children.containsKey(ch)) {
                    return; // No further match found
                }
                
                currentNode = currentNode.children.get(ch);
                dp[i + 1] = Math.min(dp[i + 1], dp[start] + 1); // Update the dp array
                
                // If we reach a terminal node (end of a word), this indicates a valid prefix
                if (currentNode.isTerminal) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[start] + 1);
                }
            }
        }
    }

    public int minValidStrings(String[] words, String target) {
        Trie trie = new Trie();
        
        // Insert all words into the Trie
        for (String word : words) {
            trie.insert(word);
        }

        int n = target.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Initial state, zero segments needed for an empty target

        // Iterate through the target string
        for (int i = 0; i < n; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                trie.findPrefixes(target, i, dp);
            }
        }

        // If dp[n] is still Integer.MAX_VALUE, no solution was found
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}
