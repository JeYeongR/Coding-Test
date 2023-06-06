class Solution {
    public int solution(int[][] board) {
        int[] dy = {-1, 0, 1, 0, -1, 1, 1, -1};
        int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
        int answer = 0;
        int size = board.length;
        int[][] temp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    temp[i][j] = 1;
                    for (int k = 0; k < 8; k++) {
                        int ny = i + dy[k];
                        int nx = j + dx[k];
                        if (nx >= 0 && ny >= 0 && nx < size && ny < size) {
                            temp[ny][nx] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(temp[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}