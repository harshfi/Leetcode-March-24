class MapSum {
    
    class Node{
        char data;
        HashMap <Character,Node> child= new HashMap<>();
        boolean isTerminal;
        int sum=0;
    }
//    private Node root;
   private Node root;
    private HashMap<String, Integer> map;
    public MapSum() {
        Node n = new Node ();
        n.data='*';
        root=n;
        map=new HashMap<>();
        
    }
    
    public void insert(String key, int val) {
        
       int prevVal = map.getOrDefault(key, 0); // Get the previous value if key exists
        map.put(key, val); // Store the new value in the map
        
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (!curr.child.containsKey(ch)) {
                Node n = new Node();
                n.data = ch;
                curr.child.put(ch, n);
            }
            curr = curr.child.get(ch);
            curr.sum = curr.sum - prevVal + val; // Adjust the sum by removing old value and adding new value
        }
        curr.isTerminal = true;
    }
    
    public int sum(String key) {
         Node  curr= root;
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if(curr.child.containsKey(ch)){
                
                curr=curr.child.get(ch);
            }
             else return 0;
            
        }
       return  curr.sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */