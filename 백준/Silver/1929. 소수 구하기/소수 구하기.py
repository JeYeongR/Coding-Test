m, n = map(int, input().split())
prime_list = []

for num in range(2, n + 1):
    is_prime = True
    for i in prime_list:
        if i*i > num:
            break
        if num % i == 0:
            is_prime = False
            break
            
    if is_prime:
        prime_list.append(num)
        if num >= m:
            print(num)