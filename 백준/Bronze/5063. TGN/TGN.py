N = int(input())

for _ in range(N):
    r, e, c = map(int, input().split())
    result = e - c - r

    if result > 0:
        print("advertise")
    elif result == 0:
        print("does not matter")
    else:
        print("do not advertise")