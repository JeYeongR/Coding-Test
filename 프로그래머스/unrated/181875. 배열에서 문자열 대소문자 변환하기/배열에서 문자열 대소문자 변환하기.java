class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        int idx = 0;
        for (int i = 0; i < strArr.length; i++) {
            if ((i + 1) % 2 != 0) {
                answer[idx++] = strArr[i].toLowerCase();
            } else {
                answer[idx++] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}