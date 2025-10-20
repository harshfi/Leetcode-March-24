class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;

        for(String i :operations){
            if(i.contains("+"))num++;
            else num--;
        }
        return num;
    }
}