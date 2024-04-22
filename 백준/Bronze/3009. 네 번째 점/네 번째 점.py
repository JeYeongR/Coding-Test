xArr = []
yArr = []

for i in range(3):
    x, y = map(int, input().split())
    xArr.append(x)
    yArr.append(y)

for i in range(3):
    if xArr.count(xArr[i]) == 1:
        x = xArr[i]
    if yArr.count(yArr[i]) == 1:
        y = yArr[i]

print(x, y)