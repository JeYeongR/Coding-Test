from collections import deque

def solution(n, wires):
    graph = [set() for _ in range(n + 1)]
    for a, b in wires:
        graph[a].add(b)
        graph[b].add(a)

    min_diff = float('inf')
    
    def bfs(start, banned):
        visited = [False] * (n + 1)
        q = deque([start])
        visited[start] = True
        count = 1
        
        while q:
            node = q.popleft()
            for neighbor in graph[node]:
                if neighbor == banned:
                    continue
                if not visited[neighbor]:
                    visited[neighbor] = True
                    count += 1
                    q.append(neighbor)
        return count

    processed = set()
    for a, b in wires:
        if (a, b) in processed: 
            continue
        processed.add((a, b))
        processed.add((b, a))
        
        cnt = bfs(a, b)
        min_diff = min(min_diff, abs(2 * cnt - n))
        
    return min_diff
