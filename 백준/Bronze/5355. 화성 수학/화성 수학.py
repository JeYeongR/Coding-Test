def calc(num, item):
    if item == '@': 
        return num * 3
    elif item == '%': 
        return num + 5
    elif item == '#': 
        return num - 7

T = int(input())

for _ in range(0, T):
    arr = list(input().split(" "))
    num = float(arr.pop(0))

    for i in arr:
        num = calc(num, i)
    print("%.2f" % num)