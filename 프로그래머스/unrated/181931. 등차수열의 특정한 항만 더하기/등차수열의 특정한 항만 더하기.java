class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int length = included.length;
        int[] nums = new int[length];
        for(int i=0; i<length; i++) {
            nums[i] = a + d * i;
            
            if(included[i]) answer += nums[i];
        }
        
        return answer;
    }
}