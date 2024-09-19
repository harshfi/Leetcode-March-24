class Solution {
    static HashMap<String,HashMap<String,Double>> map=new HashMap<>();
	public double[] calcEquation(List<List<String>> e, double[] v, List<List<String>> q) {
		List<Double> l=new ArrayList<>();
		map=new HashMap<>();
		int cnt=0;
        for(List i: e) {
        	
        	map.put((String) i.get(0), new HashMap<String,Double>());
        	map.put((String)i.get(1), new HashMap<String,Double>());
        }
        for(List i: e) {
        	build((String)i.get(0),(String)i.get(1),v[cnt]);
        	cnt++;
        }
        
        for(List i : q) {
        	 if (map.containsKey(i.get(0)) && map.containsKey(i.get(1))) {
                 if (i.get(0).equals(i.get(1))) l.add(1.000);
                 else l.add(find((String) i.get(0), (String) i.get(1)));
             } else {
                 l.add(-1.0);
             }
        }
        double ans[]= new double[l.size()];
        cnt=0;
        for(double i:l) {
        	ans[cnt]=i;
        	cnt++;
        }
        System.out.println(l);
        return ans ;
        
    }
	static class Node{
		String s1="";
		String s2="";
		double cost=Double.MAX_VALUE;
	}
	public static double find(String src, String dis) {
		double cost=Double.MAX_VALUE;
		Queue<Node> q= new LinkedList<>();
		List<String> visited= new ArrayList<>();
		Node n=new Node();
		n.s1=src;
		n.s2=dis;
		n.cost=1;
		q.add(n);
		while(!q.isEmpty()) {
			Node re= q.poll();
			if(visited.contains(re.s1)) continue;
			
			visited.add(re.s1);
			
			if((re.s1).equals(dis)) cost=Math.min(cost, re.cost);
			
			for(String nbrs : map.get(re.s1).keySet()) {
				if(!visited.contains(nbrs)) {
					Node n1= new Node();
					n1.s1=nbrs;
					n1.cost=re.cost*map.get(re.s1).get(nbrs);
					n1.s2=dis;
					q.add(n1);
				}
			}
		}
		
		return cost==Double.MAX_VALUE?-1:cost;
	}
	public static void build(String s1,String s2,double v) {
		
		map.get(s1).put(s2,v);
		map.get(s2).put(s1,1/v);
	}

}
