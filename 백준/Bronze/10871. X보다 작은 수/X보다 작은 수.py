N, X = map(int, input().split())
list = list(map(int, input().split()))

for i in list:
    if X > i:
        print(i, end = " ")