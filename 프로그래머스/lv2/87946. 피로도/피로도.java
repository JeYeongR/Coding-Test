class Solution {
    public int answer = -1;
    public boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        adventure(k, dungeons, 0);

        return answer;
    }

    public void adventure(int k, int[][] dungeons, int play) {
        answer = Math.max(answer, play);

        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k>=dungeons[i][0] ) {
                visited[i] = true;
                adventure(k - dungeons[i][1], dungeons, play + 1);
                visited[i] = false;
            }
        }

    }
}