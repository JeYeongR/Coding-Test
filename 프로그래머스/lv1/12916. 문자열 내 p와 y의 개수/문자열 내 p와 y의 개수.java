class Solution {
    boolean solution(String s) {
        int countY = 0;
        int countP = 0;

        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i)=='y') || (s.charAt(i)=='Y')) {
                countY++;
            }
            if((s.charAt(i)=='p') || (s.charAt(i)=='P') ) {
                countP++;
            } 
        }
        if(countY == countP) {
            return true;
        } else {
           return false;
        }
    }
}