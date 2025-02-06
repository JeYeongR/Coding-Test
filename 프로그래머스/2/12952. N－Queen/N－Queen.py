def solution(n):
    def getAns(n, y, width, diagonal1, diagonal2):
        ans = 0
        if y == n:
            ans += 1
        else:
            for i in range(n):
                if width[i] or diagonal1[i + y] or diagonal2[i - y + n]:
                    continue
                width[i] = diagonal1[i + y] = diagonal2[i - y + n] = True
                ans += getAns(n, y + 1, width, diagonal1, diagonal2)
                width[i] = diagonal1[i + y] = diagonal2[i - y + n] = False
        return ans
    
    return getAns(n, 0, [False] * n, [False] * (n * 2), [False] * (n * 2))