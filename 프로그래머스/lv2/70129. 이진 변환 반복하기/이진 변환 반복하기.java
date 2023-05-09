class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int sum = 0;
        int prevLength;

        while (!s.equals("1")) {
            prevLength = s.length();
            s = s.replaceAll("0", "");
            count++;
            int length = s.length();
            sum += prevLength - length;
            s = Integer.toBinaryString(length);
        }

        answer[0] = count;
        answer[1] = sum;

        return answer;
    }
}