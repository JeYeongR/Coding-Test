N = int(input())
list = []

for i in range(N):
    a, b, c = map(int, input().split())
    if (a==b and b==c):
        result = 10000 + a * 1000
    elif (a==b or a==c):
        result = 1000 + a * 100
    elif (b==c):
        result = 1000 + b * 100
    else:
        result = max(a, b, c) * 100
    list.append(result)
    
print(max(list))