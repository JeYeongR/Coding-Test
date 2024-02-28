import sys

for i in sys.stdin:
    A, B = map(int, i.split())
    print(A + B)