a,b,c,x,y = list(map(int,input().split()))
ans = 0
n = min(x,y)
if n * (a+b) > 2*n*c:
    ans += 2*n*c
else:
    ans +=  n * (a+b)
sa = x-y
if sa < 0:
    if b > 2*c:
        ans += 2*c*abs(sa)
    else:
        ans += b*abs(sa)
else:
    if a > 2*c:
        ans += 2*c*abs(sa)
    else:
        ans += a*abs(sa)
print(ans)

