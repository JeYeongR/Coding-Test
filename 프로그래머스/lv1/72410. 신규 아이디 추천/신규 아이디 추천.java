class Solution {
    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();

        answer = checkSpecialChar(new_id, answer);

        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        answer = checkFullStop(answer);

        if (answer.isEmpty()) answer = "a";


        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = checkFullStop(answer);
        }

     
        while (answer.length() < 3) {
            char c = answer.charAt(answer.length() - 1);
            answer += c;
        }
        
        return answer;
    }

    private String checkSpecialChar(String new_id, String answer) {
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (Character.isDigit(ch) || Character.isAlphabetic(ch) || ch == '-' || ch == '_' || ch == '.') {
                answer += ch;
            }
        }

        return answer;
    }

    private String checkFullStop(String answer) {
        if (!answer.isEmpty() && answer.charAt(0) == '.') answer = answer.substring(1);

        if (!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, answer.length() - 1);

        return answer;
    }
}