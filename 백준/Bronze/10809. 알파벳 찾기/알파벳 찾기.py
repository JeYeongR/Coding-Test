chars = [-1] * 26
str = input()

for i in str:
    chars[ord(i) - 97] = str.index(i)

for char in chars:
    print(char, end = " ")