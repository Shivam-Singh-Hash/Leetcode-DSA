class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();

        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int room = queue.poll();

            for (int i = 0; i < rooms.get(room).size(); i++) {

                int key = rooms.get(room).get(i);

                if (!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                }
            }
        }

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }
}