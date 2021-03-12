n = int(input())
p = list(map(int,input().split()))
q = list(map(int,input().split()))

import itertools
idx = [i for i in range(1,n+1)]
ls = [list(x) for x in itertools.permutations(idx)]
a = ls.index(p)+1
b= ls.index(q)+1
print(abs(a-b))

