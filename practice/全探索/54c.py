import numpy as np
from itertools import permutations as pm

n,m = list(map(int,input().split()))
ab = [list(map(int,input().split())) for i in range(m)]

idx = [i for i in range(1,n+1)]
ls = pm(idx)

ls_= []
for i in ls:
    if i[0] != 1:
        break
    ls_.append(list(i))

G = np.zeros((10,10))
for i in range(m):
    a,b = ab[i]
    G[a,b] = G[b,a] = 1


ans =0 
for l in ls_: 
    flag=True

    for j in range(n-1):
        fm = l[j]
        to = l[j + 1]
        if not G[fm,to]: flag = False

    if flag:
        ans += 1
            
print(ans)