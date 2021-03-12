n,a,b = list(map(int,input().split()))
ans = 0
for i in range(n+1):
    wa = sum([int(x) for x in str(i)])
    if wa >= a and wa <= b:
        ans += i
print(ans)