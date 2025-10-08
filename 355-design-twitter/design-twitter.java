class Twitter {
    private static int time = 0;
    private Map<Integer, List<int[]>> userQ;
    private Map<Integer, Set<Integer>> followerQ;

    public Twitter() {
        userQ = new HashMap<>();
        followerQ = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        userQ.computeIfAbsent(userId, k -> new ArrayList<>()).add(new int[]{time++, tweetId});
        followerQ.computeIfAbsent(userId, k -> new HashSet<>()).add(userId); // follow self
    }

    public List<Integer> getNewsFeed(int userId) {
        if (!followerQ.containsKey(userId)) return new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // min-heap by time
        for (int followee : followerQ.get(userId)) {
            if (!userQ.containsKey(followee)) continue;
            for (int[] tweet : userQ.get(followee)) {
                pq.add(tweet);
                if (pq.size() > 10) pq.poll(); // keep only 10 most recent
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll()[1]);
        }
        Collections.reverse(res);
        return res;
    }

    public void follow(int followerId, int followeeId) {
        followerQ.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerQ.containsKey(followerId) && followeeId != followerId)
            followerQ.get(followerId).remove(followeeId);
    }
}
