/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> e, int id) {
        HashMap<Integer,Integer> imp= new HashMap<>();
        HashMap<Integer,List<Integer>> sub= new HashMap<>();

        for(Employee i : e){
            imp.put(i.id,i.importance);
            sub.put(i.id,i.subordinates);
        }
        Stack<Integer> st=new Stack<>();
        st.add(id);
        Set<Integer> set= new HashSet<>();
        int sum=0;
        while(!st.isEmpty()){
            int re= st.pop();
            if(set.contains(re)) continue;
            
            set.add(re);
            sum=sum+imp.get(re);

            for(int i : sub.get(re)){
                if(!set.contains(i)){
                    st.add(i);
                }
            }

        }
        return sum;
    }
}