class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(answer[i].length()!=n) {
                String a = "";
                for(int j=0; j<n-answer[i].length(); j++) {
                    a += "0";
                }
                answer[i] = a + Integer.toBinaryString(arr1[i] | arr2[i]);
            }

            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }

        return answer;
    }
}