def solution(clothes):
    closet = {} 
    for _, kind in clothes:
        if kind in closet.keys():
            closet[kind] += 1
        else:
            closet[kind] = 1
    
    answer = 1
    for value in closet.values():
        answer *= (value + 1)
        
    return answer - 1