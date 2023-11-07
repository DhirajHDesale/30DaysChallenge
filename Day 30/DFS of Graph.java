class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
         boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        
        
        dfs(0, adj, visited, result);
        
        return result;
    }
    
    private void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[v] = true;
        result.add(v);
        
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }

    }
}