import sys

T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print("Case #%s: %s" % (i + 1, A + B))