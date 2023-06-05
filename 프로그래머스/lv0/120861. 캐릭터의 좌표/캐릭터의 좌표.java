class Solution {
    public int[] solution(String[] keyinput, int[] board) {  
        int[] answer = new int[]{0, 0};
        
        for(int i=0; i<keyinput.length; i++) {
            if(keyinput[i].equals("up") && Math.abs(answer[1]+1) <= board[1]/2) {
                answer[1]++;
            } else if(keyinput[i].equals("down") && Math.abs(answer[1]-1) <= board[1]/2) {
                answer[1]--;
            } else if(keyinput[i].equals("left") && Math.abs(answer[0]-1) <= board[0]/2) {
                answer[0]--;
            } else if(keyinput[i].equals("right") && Math.abs(answer[0]+1) <= board[0]/2) {
                answer[0]++;
            }
        }
        
        return answer;
    }
}