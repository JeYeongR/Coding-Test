s = input().upper()
unique_list = list(set(s))
counts = []

for u in unique_list:
    counts.append(s.count(u))

print("?") if counts.count(max(counts)) > 1 else print(unique_list[counts.index(max(counts))])