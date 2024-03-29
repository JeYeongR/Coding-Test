def solution(s):
    stack = []
    for i in range(len(s)):
        c = s[i]
        if stack and c == ")":
            stack.pop()
        else:
            stack.append(c)
    
    return len(stack) == 0