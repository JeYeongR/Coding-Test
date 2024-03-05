arr = [[0] * 100 for _ in range(100)]

for _ in range(int(input())): # 색종이를 1로 채워준다
    a, b = map(int, input().split())
    for i in range(a, a+10):
        for j in range(b, b+10):
            arr[i][j] = 1

result = 0
for i in arr: 
    result += sum(i)

print(result)