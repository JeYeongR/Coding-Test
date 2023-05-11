class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        long save = x;
        int sum = 0;
        
        while (save > 0) {
            sum += (int) (save % 10);
            save = (int) (save / 10);
        }
        
        if(x%sum!=0) {
            answer = false;
        }
        
        return answer;
    }
}