n = int(input())
s = input()

ans = 0
for i in range(10):
    a = s.find(str(i),)
    if a == -1: continue

    for j in range(10):
        b = s.find(str(j), a + 1)
        if b == -1 : continue
    
        for k in range(10):
            if s.find(str(k), b + 1) != -1:
                ans += 1
print(ans)