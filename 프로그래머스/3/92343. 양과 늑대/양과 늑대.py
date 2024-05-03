from collections import deque

def solution(info, edges):
    def build_tree(info, edges):
        tree = [[] for _ in range(len(info))]
        for edge in edges:
            tree[edge[0]].append(edge[1])
        return tree
    
    tree = build_tree(info, edges)
    max_sheep = 0
    
    q = deque([(0, 1, 0, set())])
    
    while q:
        current, sheep_count, wolf_count, visited = q.popleft()
        max_sheep = max(max_sheep, sheep_count)
        visited.update(tree[current])
        
        for next_node in visited:
            if info[next_node]:
                if sheep_count != wolf_count + 1:
                    q.append((next_node, sheep_count, wolf_count + 1, visited - {next_node}))
            else:
                q.append((next_node, sheep_count + 1, wolf_count, visited - {next_node}))
    return max_sheep