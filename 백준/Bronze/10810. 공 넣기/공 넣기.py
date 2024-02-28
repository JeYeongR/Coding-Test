N, M = map(int, input().split())
basket = [0] * N
for i in range(M):
    i,j,k = map(int,input().split())
    for x in range(i,j+1):
        basket[x-1] = k

for x in range(N):
    print(basket[x], end=" ")