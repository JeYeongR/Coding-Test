def solution(s):
    stack = []
    for c in s.split():
        if stack and c == 'Z':
            stack.pop()
        else:
            stack.append(int(c))

    return sum(stack)