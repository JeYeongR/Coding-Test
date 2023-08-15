class Solution {
    
    Set<String> set = new HashSet<>();
    char[] arr;
    boolean[] visited;
    
    public int numTilePossibilities(String tiles) {
        arr = tiles.toCharArray();
        visited = new boolean[tiles.length()];
        
        dfs("");
        
        return set.size();
    }
    
    
    public void dfs(String str) {
        for(int i = 0; i<visited.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                set.add(str + arr[i]);
                dfs(str + arr[i]);
                visited[i] = false;
            }
        }
    }
}