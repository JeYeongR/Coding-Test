import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int endIndex = arr.length;
            int startIndex = 0;
            if (i % 2 == 0) {
                endIndex = query[i] + 1;
            } else {
                startIndex = query[i];
            }
            arr = Arrays.copyOfRange(arr, startIndex, endIndex);
        }

        return arr;
    }
}