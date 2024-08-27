class Solution {
     public static class Pair {
        int nbgr;
        double pro;
    }

    public static class QueuePair {
        int ele;
        double pro;

        QueuePair(int ele, double pro) {
            this.ele = ele;
            this.pro = pro;
        }
    }

    // public static void main(String[] args) {
    //     int n = 5, start = 0, end = 3;
    //     int[][] edges = {{2, 3}, {1, 2}, {3, 4}, {1, 3}, {1, 4}, {0, 1}, {2, 4}, {0, 4}, {0, 2}};
    //     double[] succProb = {0.06, 0.26, 0.49, 0.25, 0.2, 0.64, 0.23, 0.21, 0.77};
    //     System.out.println(maxProbability(n, edges, succProb, start, end));
    // }

    public static double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer, List<Pair>> map = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            map.computeIfAbsent(edges[i][0], k -> new ArrayList<>());
            Pair p = new Pair();
            p.nbgr = edges[i][1];
            p.pro = succProb[i];
            map.get(edges[i][0]).add(p);

            map.computeIfAbsent(edges[i][1], k -> new ArrayList<>());
            Pair p2 = new Pair();
            p2.nbgr = edges[i][0];
            p2.pro = succProb[i];
            map.get(edges[i][1]).add(p2);
        }
          if(!map.containsKey(start_node)) return 0.0;
        PriorityQueue<QueuePair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.pro, a.pro));
        pq.add(new QueuePair(start_node, 1.0));

        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        while (!pq.isEmpty()) {
            QueuePair current = pq.poll();

            if (current.ele == end_node) {
                return current.pro;
            }

            if (current.pro < maxProb[current.ele]) continue;

            for (Pair neighbor : map.get(current.ele)) {
                double newProb = current.pro * neighbor.pro;
                if (newProb > maxProb[neighbor.nbgr]) {
                    maxProb[neighbor.nbgr] = newProb;
                    pq.add(new QueuePair(neighbor.nbgr, newProb));
                }
            }
        }

        return 0.0;
    }
}