class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        int ana[][]= new int [words.length][26];

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                int ch=words[i].charAt(j)-'a';
                ana[i][ch]++;
            }
        }
      
      List<String> ans=new ArrayList<>();
      boolean arr[]=new boolean [words.length];
      ans.add(words[0]);
      int idx=0;
      for(int i=1;i<words.length;i++){
           boolean f=find(ana[idx],ana[i]);
           if(f==false){
            ans.add(words[i]);
            idx=i;
           }
      }
      return ans;



    }
    public boolean find(int arr1[], int arr2[]){
        for(int i=0;i<arr1.length;i++){
          if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }
}