numbers = [];
for i in range(9):
    numbers.append(int(input()))

maxNum = max(numbers);
print(maxNum)
print(numbers.index(maxNum) + 1)