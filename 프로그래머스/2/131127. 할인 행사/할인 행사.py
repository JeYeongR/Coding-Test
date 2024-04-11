def solution(want, number, discount):
    want_dict = {}
    for i in range(len(want)):
        want_dict[want[i]] = number[i]
        
    answer = 0
    
    for i in range(len(discount) - 9):
        discount_10d = {}
        
        for j in range(i, i + 10):
            if discount[j] in want_dict:
                discount_10d[discount[j]] = discount_10d.get(discount[j], 0) + 1
        
        if discount_10d == want_dict:
            answer += 1
            
    return answer