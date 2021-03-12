n = int(input())
a = list(map(int,input().split()))
b = list(map(int,input().split()))
c = list(map(int,input().split()))

s = 0
prev = None
for ai in a:
    s += b[ai-1]
    if prev == ai-1: s += c[prev-1]
    prev = ai
print(s)