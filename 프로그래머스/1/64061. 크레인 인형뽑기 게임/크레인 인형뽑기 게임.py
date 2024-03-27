def solution(board, moves):
    lanes = [[] for _ in range(len(board[0]))]
    
    for i in range(len(board) - 1, -1, -1):
        for j in range(len(board[0])):
            if board[i][j]:
                lanes[j].append(board[i][j])
                
    bucket = []
    
    answer = 0
    
    for m in moves:
        if lanes[m - 1]:
            doll = lanes[m - 1].pop()
            
            if bucket and bucket[-1] == doll:
                bucket.pop()
                answer += 2
            else:
                bucket.append(doll)
                
    return answer