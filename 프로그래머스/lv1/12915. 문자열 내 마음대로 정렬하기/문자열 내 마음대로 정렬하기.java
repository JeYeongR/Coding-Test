import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        String[] answer = new String[length];
        char[] temp = new char[length];

        for (int i = 0; i < length; i++) {
            temp[i] = strings[i].charAt(n);
        }

        Arrays.sort(strings);
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                String string = strings[j];
                if (!string.isBlank() && temp[i] == string.charAt(n)) {
                    answer[i] = string;
                    strings[j] = "";
                    break;
                }
            }
        }

        return answer;
    }
}