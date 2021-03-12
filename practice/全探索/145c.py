import itertools
import numpy as np

n = int(input())
xy = [list(map(int,input().split())) for i in range(n)]
idx = [i for i in range(n)]
ls_idx = itertools.permutations(idx)
d_ls = []
for i in ls_idx:
    xi,yi = xy[i[0]]
    sum = 0
    for j in i[1:]:
        xj,yj = xy[j]
        dst = np.sqrt((xi-xj)**2 + (yi-yj)**2)
        sum += dst
        xi,yi = xj,yj
    d_ls.append(sum) 
print(np.mean(d_ls))

