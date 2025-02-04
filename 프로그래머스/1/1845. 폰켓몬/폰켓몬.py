def solution(nums):
    n = len(set(nums))
    k = len(nums) // 2
    return min(k, n)