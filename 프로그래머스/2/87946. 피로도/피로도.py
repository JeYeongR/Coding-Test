def dfs(k, cnt, dungeons, visited):
    max_cnt = cnt
    for i in range(len(dungeons)):
        if k >= dungeons[i][0] and visited[i] == 0:
            visited[i] = 1
            max_cnt = max(max_cnt, dfs(k - dungeons[i][1], cnt + 1, dungeons, visited))
            visited[i] = 0
    return max_cnt

def solution(k, dungeons):
    visited = [0] * len(dungeons)
    result = dfs(k, 0, dungeons, visited)
    return result