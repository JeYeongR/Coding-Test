def solution(n, left, right):
    answer = []

    for i in range(left, right+1):
        q, r = divmod(i, n)

        answer.append(max(q, r) + 1)

    return answer