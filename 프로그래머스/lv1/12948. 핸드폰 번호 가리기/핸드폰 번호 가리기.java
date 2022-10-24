class Solution {
    public String solution(String phone_number) {
       String answer = "";
        char[] charArr = phone_number.toCharArray();
        char[] charArr2 = new char[charArr.length];

        for(int i=0; i<charArr.length; i++) {
            charArr2[i] = '*';
        }
        for(int i=0; i<4; i++) {
            charArr2[charArr2.length-i-1] = charArr[charArr.length-i-1];
        }
        for(int i=0; i<charArr2.length; i++) {
            answer += charArr2[i];
        }
        return answer;
    }
}