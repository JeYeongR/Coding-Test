H, M = input().split()
H = int(H)
M = int(M)

M -= 45

if M < 0:
    M += 60
    H -= 1
    if H < 0:
        H += 24

print(H, M)