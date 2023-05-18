class Solution {
    public int solution(int a, int b) {
        String mix = "" + a + b;
        
        return Math.max(Integer.parseInt(mix), 2*a*b);
    }
}