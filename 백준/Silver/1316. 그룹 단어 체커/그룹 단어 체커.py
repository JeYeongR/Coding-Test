N = int(input())
result = N

for i in range(N):
    s = input()
    for j in range(len(s) - 1):
        if s[j] == s[j + 1]:
            continue
        elif s[j] in s[j + 1 :]:
            result -= 1
            break

print(result)
        