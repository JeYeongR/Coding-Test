dict = {
    "ABC": 3,
    "DEF": 4,
    "GHI": 5,
    "JKL": 6,
    "MNO": 7,
    "PQRS": 8,
    "TUV": 9,
    "WXYZ": 10
}

s = input()
time = 0;
for i in s:
    for k, v in dict.items():
        if i in k:
            time += v
print(time)