class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odds = 0;
        int evens = 0;
        
        for(int num : num_list) {
            if(num%2!=0) odds++;
            else evens++;
        }
        
        answer[0] = evens;
        answer[1] = odds;
        
        return answer;
    }
}