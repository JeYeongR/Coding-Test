class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int OneIndex = 0;
        int TwoIndex = 0;
        for(int i=0; i<goal.length; i++) {
            if(OneIndex<cards1.length && goal[i].equals(cards1[OneIndex])) {
                OneIndex++;
            } else if(TwoIndex<cards2.length && goal[i].equals(cards2[TwoIndex])) {
                TwoIndex++;
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}