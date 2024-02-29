T = int(input())

for i in range(T):
    R, S = input().split()
    answer = ""
    for c in S:
        answer += c * int(R)
    print(answer)