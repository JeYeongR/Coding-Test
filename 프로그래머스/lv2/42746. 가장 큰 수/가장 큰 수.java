import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNum = new String[numbers.length];

        for(int i=0; i<strNum.length; i++) {
            strNum[i] = Integer.toString(numbers[i]);
        }
        // 앞뒤로 이어붙인 값을 기준으로 내림차순으로 정렬
        Arrays.sort(strNum, ((s1, s2) -> (s2+s1).compareTo(s1+s2)));

        for(String s : strNum) {
            answer += s;
        }

        return strNum[0].equals("0") ? "0" : answer;
    }
}