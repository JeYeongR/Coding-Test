s = input()

for c in ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]:
    s = s.replace(c, "1")

print(len(s))