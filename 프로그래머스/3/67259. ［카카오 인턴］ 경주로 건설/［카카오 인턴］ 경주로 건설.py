import heapq

def solution(board):
    N = len(board)
    dirs = [(0,-1), (-1,0), (0,1), (1,0)]
    
    def is_valid(x, y):
        return 0 <= x < N and 0 <= y < N
    
    visited = [[[float('inf')]*4 for _ in range(N)] for _ in range(N)]
    heap = [(0, 0, 0, -1)]
    
    while heap:
        cost, x, y, prev = heapq.heappop(heap)
        
        if x == N-1 and y == N-1:
            return cost
        
        for d, (dx, dy) in enumerate(dirs):
            nx, ny = x+dx, y+dy
            if not is_valid(nx, ny) or board[nx][ny]: continue
                
            new_cost = cost + (100 if d == prev or prev == -1 else 600)
            
            if new_cost < visited[nx][ny][d]:
                visited[nx][ny][d] = new_cost
                heapq.heappush(heap, (new_cost, nx, ny, d))
    
    return min(visited[N-1][N-1])
