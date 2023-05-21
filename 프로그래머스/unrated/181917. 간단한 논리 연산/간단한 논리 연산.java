class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        
        boolean first = true;
        if(!x1 && !x2) {
            first = false;
        }
        
        boolean second = true;
        if(!x3 && !x4) {
            second = false;
        }
        
        if(first && second) {
            answer = true;
        }
        
        return answer;
    }
}