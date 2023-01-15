class Solution {
    // 1. 삼각형의 꼭대기인 triangle[0][0]은 공통으로 들어감
    // 2. 두번째 줄부터 자신과 위에 있는 숫자를 더 함
    //   2-1. 왼쪽 끝 숫자면 위에 있는 숫자는 오른쪽 대각선만 있음
    //   2-2. 오른쪽 끝 숫자면 위에 있는 숫자는 왼쪽 대각선만 있음
    //   2-3. 중앙에 있는 숫자면 위에 있는 숫자는 오른쪽, 왼쪽 대각선에 둘 다 있으니 둘 중 더해서 큰 값으로 정함
    public static int solution(int[][] triangle) {
        int answer = 0;
        // 1. 삼각형의 꼭대기인 triangle[0][0]은 공통으로 들어감 
        for (int i = 1; i < triangle.length; i++) { // 2. 두번째 줄부터 자신과 위에 있는 숫자를 더 함
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) { // 2-1. 왼쪽 끝 숫자면 위에 있는 숫자는 오른쪽 대각선만 있음
                    triangle[i][j] += triangle[i - 1][j];
                } else if (j == i) { // 2-2. 오른쪽 끝 숫자면 위에 있는 숫자는 왼쪽 대각선만 있음
                    triangle[i][j] += triangle[i - 1][j - 1];
                } else { // 2-3. 중앙에 있는 숫자면 위에 있는 숫자는 오른쪽, 왼쪽 대각선에 둘 다 있으니 둘 중 더해서 큰 값으로 정함 
                    triangle[i][j] += Math.max(triangle[i - 1][j], triangle[i-1][j-1]);
                }

                answer = Math.max(answer, triangle[i][j]);
            }
        }

        return answer;
    }
}