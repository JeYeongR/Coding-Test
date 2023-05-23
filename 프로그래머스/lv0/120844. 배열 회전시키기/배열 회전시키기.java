class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        
        if(direction.equals("right")) {
            for(int i=1; i<length; i++) {
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[length - 1];
        } else {
            for(int i=0; i<length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[length-1] = numbers[0];
        }
        return answer;
    }
}