class Solution {
     public String solution(String s) {
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                answer.append(" ");
                continue;
            }
            char c = Character.toUpperCase(word.charAt(0));
            word = word.substring(1).toLowerCase();
            word = c + word;
            answer.append(word)
                    .append(" ");
        }

        answer.delete(answer.length() - 1, answer.length());
        
        while (answer.length() != s.length()) {
            answer.append(" ");
        }

        return answer.toString();
    }
}