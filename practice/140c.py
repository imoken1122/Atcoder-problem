n= int(input())
b = list(map(int,input().split()))
ans = b[0] + b[-1] 
for i in range(0,len(b)-1):
    ans += min(b[i],b[i+1])
print(ans)