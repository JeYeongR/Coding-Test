import heapq

def solution(N, road, K):
    graph = [[] for _ in range(N+1)]
    road_dict = {}
    for a, b, cost in road:
        key = tuple(sorted((a, b)))
        if key not in road_dict or cost < road_dict[key]:
            road_dict[key] = cost
    
    for (a, b), cost in road_dict.items():
        graph[a].append((b, cost))
        graph[b].append((a, cost))
    
    distances = [float('inf')] * (N+1)
    distances[1] = 0
    heap = [(0, 1)]
    
    while heap:
        current_dist, node = heapq.heappop(heap)
        if current_dist > distances[node]:
            continue
        for neighbor, weight in graph[node]:
            distance = current_dist + weight
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(heap, (distance, neighbor))
    
    return sum(1 for d in distances[1:] if d <= K)
