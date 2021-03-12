a = int(input())
b = int(input())
c = int(input())
x = int(input())

cnt = 0
for ai in range(a+1):
    for bj in range(b+1):
        ck = int((x - ai*500 - bj*100)/50)
        if ai+bj+ck >= 1 and c >= ck and ck >= 0:
            cnt += 1
print(cnt)





