N = int(input())

list = list(map(int, input().split()))

maxNum = max(list)
for i in range(N):
    list[i] = list[i] / maxNum * 100

print(sum(list) / N)
