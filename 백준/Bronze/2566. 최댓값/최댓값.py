arr = []

for i in range(9):
    arr.append(list(map(int, input().split())))

max = 0
row = 0
col = 0
for i in range(9):
    for j in range(9):
        if max <= arr[i][j]:
            max = arr[i][j]
            row = i + 1
            col = j + 1
    
print(max)
print(row, col)