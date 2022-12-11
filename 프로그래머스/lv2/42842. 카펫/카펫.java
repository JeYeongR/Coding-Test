class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 1. 갈색과 노란색을 더해줌
        int sum = brown + yellow;

        // 2. 더한 값의 약수 조합을 찾음
        for(int i=1; i<sum; i++) {
            int width = i;
            int height = sum/i;

            // 3. 가로 길이는 세로 길이와 같거나, 세로 길이보다 길어야함
            if (width >= height) {
                // 4. 노란색은 갈색 중앙에 있어야하므로 가로, 세로는 3이상이어야함
                if((width-2)*(height-2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        return answer;
    }
}