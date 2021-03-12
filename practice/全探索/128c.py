n,m = list(map(int,input().split()))
l = [list(map(int,input().split())) for i in range(m)]
p = list(map(int,input().split()))
cnt = 0
for bit in range(1 << n):
    flag = True

    for j in range(m):
        temp = 0
        for s in l[j][1:]:

            if bit & (1 << s-1):
                temp += 1
        if temp % 2 != p[j]:
            flag = False
            break

    if flag:
        cnt += 1
print(cnt)
    

