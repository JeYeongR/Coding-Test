class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] temp = new int[201];
        for(int[] line : lines) {
            for(int i=line[0] + 100; i<line[1] + 100; i++) {
                temp[i]++;
            }
        }
        
        for(int i=0; i<temp.length; i++) {
            if(temp[i] > 1) answer++;
        }
        
        return answer;
    }
}