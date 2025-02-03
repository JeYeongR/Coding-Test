def solution(array):
    counts = {}
    for num in array:
        counts[num] = counts.get(num, 0) + 1

    max_count = max(counts.values())

    modes = [num for num, count in counts.items() if count == max_count]

    return modes[0] if len(modes) == 1 else -1