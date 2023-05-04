class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index;
        int move = name.length() - 1;
        for (int i = 0; i < length; i++) {
            char aChar = name.charAt(i);
            if (aChar < 'N') {
                answer += aChar - 65;
            } else {
                answer += Math.abs(91 - aChar);
            }

            index = i + 1;
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            move = Math.min(move, i * 2 + length - index);

            move = Math.min(move, (length - index)*2 + i);
        }

        return answer + move;
    }
}