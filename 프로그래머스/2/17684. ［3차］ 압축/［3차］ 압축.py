def solution(msg):
    answer = []
    alpha = {chr(i + 64): i for i in range(1, 27)}

    while True:
        if msg in alpha:
            answer.append(alpha[msg])
            break
        for i in range(1, len(msg)):
            if msg[:i + 1] not in alpha:
                answer.append(alpha[msg[:i]])
                alpha[msg[:i + 1]] = len(alpha) + 1
                msg = msg[i:]
                break
                
    return answer