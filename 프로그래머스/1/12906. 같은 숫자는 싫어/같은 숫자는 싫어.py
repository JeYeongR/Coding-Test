def solution(arr):
    answer = []
    for i in range(len(arr)):
        if i == 0 or arr[i - 1] != arr[i]:
            answer.append(arr[i])
    return answer