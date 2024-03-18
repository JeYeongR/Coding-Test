def solution(arr, divisor):
    answer = []
    for num in arr:
        if(num % divisor == 0):
            answer.append(num)
    return sorted(answer) if len(answer) != 0 else [-1]