n = int(input())
a = sorted(list(map(int,input().split())))
b = sorted(list(map(int,input().split())))
c = sorted(list(map(int,input().split())))

cnt = 0
from bisect import bisect_left as bl
from bisect import bisect_right as br
for i in range(n):
    a_idx = bl(a, b[i])
    c_idx = n - br(c, b[i])
    cnt += a_idx*c_idx


print(cnt)