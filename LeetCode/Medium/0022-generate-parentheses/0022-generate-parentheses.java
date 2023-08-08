class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        
        dfs(list, "", n, n);
        
        return list;
    }

    public void dfs(List<String> res, String s, int open, int close) {
        if (open == 0 && close == 0) {
            res.add(s);
            return;
        }

        if (open > 0) dfs(res, s + "(", open - 1, close);

        if (close > open) dfs(res, s + ")", open, close - 1);
    }
}