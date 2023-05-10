class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int length = lottos.length;
        int count = 0;
        int countZero = 0;

        for(int i=0; i<length; i++) {
            if(lottos[i] == 0) {
                countZero++;
            }
            for(int j=0; j<length; j++) {
                if(lottos[i] == win_nums[j]) {
                    count++;
                }

            }
        }

        answer[0] = 7 - count - countZero;
        answer[1] = 7 - count;

        if(count == 0) {
            answer[1] = 6;
            if(countZero == 0) {
                answer[0] = 6;
            }
        } 

        return answer;
    }
}