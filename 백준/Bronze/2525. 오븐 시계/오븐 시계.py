A, B = input().split()
C = input()

A = int(A)
B = int(B)
C = int(C)

B += C

if B >= 60:
    A += B // 60
    B = B % 60
    if A > 23:
        A -= 24

print(A, B)