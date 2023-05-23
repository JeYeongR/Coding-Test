class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int idx = 1;
        for(int i=0; i<k-1; i++) {
            idx += 2;
            
            if(idx > numbers.length) {
                idx = idx - numbers.length;
            } 
        }
        
        return idx;
    }
}