class WordDictionary {
    class Node{
        Node[] links;
        boolean flag;

        public Node(){
            links = new Node[26];
            flag = false;
        }
    }

    private Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node dummy = root;
        for(char c : word.toCharArray()){
            int index = c - 'a';
            if(dummy.links[index] == null) dummy.links[index] = new Node();
            dummy = dummy.links[index];
        }
        dummy.flag = true;
    }
    
    public boolean search(String word) {
        return find(0 , word.toCharArray() , root);
    }

    private boolean find(int index , char[] charArray , Node dummy){
        if(index == charArray.length) return dummy.flag;
        char c = charArray[index];
        if(c == '.'){
            for(Node child : dummy.links){
                if(child != null && find(index+1 , charArray , child)) return true;
            }
            return false;
        }else {
            int i = c - 'a';
            if(dummy.links[i]==null) return false;
            return find(index + 1 , charArray , dummy.links[i]);
        }
    }
}