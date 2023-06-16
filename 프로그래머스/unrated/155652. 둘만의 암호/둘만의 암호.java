class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char c = s.charAt(i);
            while (count != index) {
                count++;
                c++;
                if(c > 'z') c = 'a';
                for (int j = 0; j < skip.length(); j++) {
                    if (c == skip.charAt(j)) {
                        count--;
                        break;
                    }
                }
            }
            answer += c;
        }

        return answer;
    }
}