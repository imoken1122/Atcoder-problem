n = int(input())
hs = [list(map(int,input().split())) for i in range(n)]

l = 0
r = 10e16
cost=0


def calm(mid):
    t=[]
    for h,s in hs:
        if mid < h :return False 
        t.append((mid - h)/s)
    ts = sorted(t)
    for i in range(len(ts)):
        if ts[i] < i:
            return False
    return True

while r-l > 1:
    mid = int((l+r)/2)
   
    if calm(mid) :
        r = mid
    else: l = mid

print(r)