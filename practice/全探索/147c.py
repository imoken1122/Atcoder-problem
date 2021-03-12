n = int(input())
data = []
for i in range(n):
    xy = []
    A = int(input())
    for k in range(A):
        xy.append(list(map(int,input().split())))
    data.append([A,xy])


max_ = 0
for bit in range(1<<n):
    flag = True
    for j in range(n):
        if not (bit & (1<<j)): continue
        A, xy = data[j]
        for a in range(A):
            x,y = xy[a]
            if y == 1 and not(bit & (1 << x-1)): flag = False
            if y == 0 and bit & (1 << x-1): flag = False

    if flag :
        max_ = max(max_, bin(bit).count("1"))

        
print(max_)  
                