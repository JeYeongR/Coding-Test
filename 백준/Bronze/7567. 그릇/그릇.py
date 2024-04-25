plates = input()
answer = 10

for i in range(1, len(plates)):
    if plates[i] == plates[i - 1]:
        answer += 5
    else:
        answer += 10

print(answer)